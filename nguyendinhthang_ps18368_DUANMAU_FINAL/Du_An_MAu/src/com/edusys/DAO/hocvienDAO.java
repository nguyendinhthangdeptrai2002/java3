/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.entity.hocvien;
import com.edusys.utils.xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinh thang
 */
public class hocvienDAO {
    
      public void insert(hocvien model) {
        String sql = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
          xjdbc.update(sql, model.getMaKH(), model.getMaNH(), model.getDiem());
    }

    public void update(hocvien model) {
        String sql = "UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?";
          xjdbc.update(sql, model.getMaKH(), model.getMaNH(), model.getDiem(), model.getMaHV());
    }

    public void delete(Integer MaHV) {
        String sql = "DELETE FROM HocVien WHERE MaHV=?";
          xjdbc.update(sql, MaHV);
    }

    public List<hocvien> selectall() {
        String sql = "SELECT * FROM HocVien";
        return selectsql(sql);
    }
    
    public hocvien selectByid(Integer mahv) {
        String sql = "SELECT * FROM HocVien WHERE MaHV=?";
        List<hocvien> list = selectsql(sql, mahv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
  
    public List<hocvien> selectBykhoahoc(int makh){
        String sql = "select* from HocVien where MaKH=?";
        return this.selectsql(sql, makh );
    }

    private List<hocvien> selectsql(String sql, Object... args) {
        List<hocvien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = xjdbc.query(sql, args);
                while (rs.next()) {
                    hocvien model = new hocvien();
        model.setMaHV(rs.getInt("MaHV"));
        model.setMaKH (rs.getInt("MaKH"));
        model.setMaNH(rs.getString("MaNH"));
        model.setDiem(rs.getDouble("Diem"));
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}
