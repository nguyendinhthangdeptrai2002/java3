/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.entity.nhanvien;
import com.edusys.utils.xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinh thang
 */
public abstract class nhanvienDAO 
 extends com.edusys.dao.EduSysDAO<nhanvien, String>{
    public void insert(nhanvien model){
        String sql="INSERT INTO NhanVien1 (MaNV, MatKhau, HoTen,GioiTinh, VaiTro) VALUES ( ?,?, ?,?, ?)";
        xjdbc.update(sql, 
                model.getMaNV(), 
                model.getMatKhau(), 
                model.getHoTen(), 
                model.getGioitinh(),//
                model.getVaiTro());
    }
    
    public void update(nhanvien model){
      String sql="UPDATE NhanVien1 SET MatKhau=?, HoTen=?,Gioitinh=?, VaiTro=? WHERE MaNV=?"; // String sql="UPDATE NhanVien1 SET MatKhau=?, HoTen=?,GioiTinh=?, VaiTro=? WHERE MaNV=?";
        xjdbc.update(sql, 
                model.getMatKhau(), 
                model.getHoTen(), 
                model.getGioitinh(),
                model.getVaiTro(),
                model.getMaNV());
    }
    
    public void delete(String MaNV){
      String sql="DELETE FROM NhanVien1 WHERE MaNV=?";  //String sql="DELETE FROM NhanVien1 WHERE MaNV=?";
       xjdbc.update(sql, MaNV);
    }
    
    public List<nhanvien> selectAll(){
         String sql="SELECT * FROM NhanVien1"; // String sql="SELECT * FROM NhanVien1";
        return this.selectBySql(sql);
    }
    
    public nhanvien selectById(String manv){
          String sql="SELECT * FROM NhanVien1 WHERE MaNV=?"; //  String sql="SELECT * FROM NhanVien1 WHERE MaNV=?";
        List<nhanvien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<nhanvien> selectBySql(String sql, Object...args){
        List<nhanvien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = xjdbc.query(sql, args);
                while(rs.next()){
                   nhanvien entity=new nhanvien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHoTen(rs.getString("HoTen"));
                   entity.setGioitinh(rs.getBoolean("GioiTinh"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
   

