/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author DELL-PC
 */


import com.edusys.entity.chuyende;
import com.edusys.entity.khoahoc;
import com.edusys.utils.xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhoahocDAO {

    public void insert(khoahoc model) {
        String sql = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
        xjdbc.update(sql, model.getMaCD(), model.getHocPhi(), model.getThoiLuong(), model.getNgayKG(), model.getGhiChu(), model.getMaNV());
    }

    public void update(khoahoc model) {
        String sql = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHERE MaKH=?";
        xjdbc.update(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getNgayKG(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaKH()
        );
    }

    public void delete(Integer MaKH) {
        String sql = "DELETE FROM KhoaHoc WHERE MaKH=?";
      xjdbc.update(sql, MaKH);
    }

    public List<khoahoc> select() {
        String sql = "SELECT * FROM KhoaHoc";
    return   selectBySql(sql);
    }
 public khoahoc selectBy_id(Integer makh){
        String sql="SELECT * FROM KhoaHoc WHERE MaKH=?";
        List<khoahoc> list = selectBySql(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }
  public List<khoahoc> selectByChuyenDe (String macd){
            String sql = "select * from KhoaHoc where MaCD=?";
            return this.selectBySql(sql, macd);
    }

    protected List<khoahoc> selectBySql(String sql, Object...args){
        List<khoahoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = xjdbc.query(sql, args);
                while(rs.next()){
                    khoahoc model=new khoahoc();
                   model.setMaKH(rs.getInt("MaKH"));
        model.setHocPhi(rs.getDouble("HocPhi"));
        model.setThoiLuong(rs.getInt("ThoiLuong"));
        model.setNgayKG(rs.getDate("NgayKG"));
        model.setGhiChu(rs.getString("GhiChu"));

        model.setMaNV(rs.getString("MaNV"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setMaCD(rs.getString("MaCD"));
                    
                    list.add(model);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
   public List<Integer> selectYears(){
       String sql ="select DISTINCT year(NgayKG) from  khoaHoc ORDER BY Year(NgayKG) DESC";
       List<Integer> list = new ArrayList<>();
       try {
           ResultSet rs = xjdbc.query(sql);
           while (rs.next()) {               
               list.add(rs.getInt(1));
           }
           rs.getStatement().getConnection().close();
           return  list;
           
       } catch (Exception e) {
           throw  new RuntimeException(e);
       }
   }

  
}
