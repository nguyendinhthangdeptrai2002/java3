/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobaovejava3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author dinh thang
 */
public class khoahocDAO {
    public void insert(khoahoc model){
        String sql ="insert into KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) value(?,?,?,?,?,?)";
        jdbc.update(sql, model.getMacd(),model.getHocphi(),model.getThoiluong(),model.getNgaykg(),model.getGhichu(),model.getManv());
    }
    
    public void update(khoahoc model){
        String sql =" update KhoaHoc set MaCD=?,hocPhi=?,ThoiLuong=?,NgayKG=?,GhiChu=?,MaNV=? where MaKH=?";
        jdbc.update(sql,
               model.getMacd() ,
               model.getHocphi(),
               model.getThoiluong(),
               model.getNgaykg(),
               model.getGhichu(),
               model.getManv(),
               model.getMakh());      
    }
    public void delete(Integer makh){
        String sql = "delete from KhoaHoc where MaKH=?";
        jdbc.update(sql, makh);
        
    }
    public List<khoahoc> selectsql(){
        String sql="select * from KhoaHoc";
        return selectbysql(sql);
    }
    public khoahoc selectByid(Integer makh){
        String sql = "select from KhoaHoc where MaKH=?";
        List<khoahoc> list = selectbysql(sql, makh);
        return list.size()>0?list.get(0):null;
    }
     public List<khoahoc> selectByKeyword(String keyword){
        String sql="SELECT * FROM khoaHoc WHERE MaCD LIKE ?";
        return this.selectbysql(sql, "%"+keyword+"%");
    }
    
    /**
     *
     * @param sql
     * @param args
     * @return
     */
    protected  List<khoahoc> selectbysql(String sql , Object...args){
       List<khoahoc> list = new ArrayList<>();
        try {
            
            ResultSet rs= null;
            try {
                
                rs = jdbc.query(sql, args);
                while(rs.next()){
                    khoahoc model = new khoahoc();
                    model.setMakh(rs.getInt("MaKH"));
                    model.setHocphi(rs.getDouble("HocPhi"));
                    model.setThoiluong(rs.getInt("ThoiLuong"));
                    model.setNgaykg(rs.getDate("NgayKG"));
                    model.setGhichu(rs.getString("GhiChu"));
                    model.setManv(rs.getString("MaNV"));
                    model.setMacd(rs.getString("MaCD"));
                     
                    list.add(model);
                }
            }
            finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
      return list;
    }
    
}
