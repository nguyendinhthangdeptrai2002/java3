/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.entity.hocvien;
import com.edusys.entity.nguoihoc;
import com.edusys.utils.xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinh thang
 */
public abstract  class NguoiHocDAO extends com.edusys.dao.EduSysDAO<nguoihoc, String>{

    public void insert(nguoihoc model){
        String sql="INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV)  VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        xjdbc.update(sql, 
                model.getMaNH(), 
                model.getHoTen(), 
                model.getNgaysinh(), 
                model.getGioiTinh(),
                model.getDienThoai(),
                model.getEmail(),
                model.getGhiChu(),
                model.getMaNV());
    }
    
    public void update(nguoihoc model){
        String sql="UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?, MaNV=? WHERE MaNH=?";
        xjdbc.update(sql, 
                model.getHoTen(), 
                model.getNgaysinh(), 
                model.getGioiTinh(), 
                model.getDienThoai(),
                model.getEmail(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaNH());
    }
    
    public void delete(String id){
        String sql="DELETE FROM NguoiHoc WHERE MaNH=?";
        xjdbc.update(sql, id);
    }
    
    public List<nguoihoc> selectAll(){
        String sql="SELECT * FROM NguoiHoc";
        return (List<nguoihoc>) selectBySql(sql);
    }
    
    public nguoihoc selectById(String manh){
        String sql="SELECT * FROM NguoiHoc WHERE MaNH=?";
        List<nguoihoc> list = selectBySql(sql, manh);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<nguoihoc> selectBySql(String sql, Object...args){
        List<nguoihoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = xjdbc.query(sql, args);
                while(rs.next()){
                    nguoihoc entity=new nguoihoc();
                    entity.setMaNH(rs.getString("MaNH"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setNgaysinh(rs.getDate("NgaySinh"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setDienThoai(rs.getString("DienThoai"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setNgDK(rs.getDate("NgayDK"));
                    list.add(entity);
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
    
    public List<nguoihoc> selectByKeyword(String keyword){
        String sql="SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }

    public List<nguoihoc> selectNotInCourse(int makh, String keyword) {
        String sql="SELECT * FROM NguoiHoc "
                + " WHERE HoTen LIKE ? AND "
                + " MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return this.selectBySql(sql, "%"+keyword+"%", makh);
    }
  
}