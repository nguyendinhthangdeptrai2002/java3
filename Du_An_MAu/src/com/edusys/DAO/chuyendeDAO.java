/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.entity.chuyende;

import com.edusys.utils.xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinh thang
 */
public abstract class chuyendeDAO extends com.edusys.dao.EduSysDAO<chuyende , String>{
    
    
    public void insert(chuyende model){
        String sql="INSERT INTO ChuyenDe  VALUES (?, ?, ?, ?, ?, ?)";
        xjdbc.update(sql, 
                model.getMaCD(), 
                model.getTenCD(), 
                model.getHocPhi(), 
                model.getThoiLuong(),
                model.getHinh(),
                model.getMoTa());
                
    }
    
    public void update(chuyende model){
        String sql="UPDATE ChuyenDe SET  TenCD=?, HocPhi=?,ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
        xjdbc.update(sql, 
                model.getTenCD(), 
                model.getHocPhi(), 
                model.getThoiLuong(), 
                model.getHinh(),
                model.getMoTa(),
                model.getMaCD());
                
    }
    
    public void delete(String id){
        String sql="DELETE FROM ChuyenDe WHERE MaCD=?";
        xjdbc.update(sql, id);
    }
    public List<chuyende> selectAll(){
        String sql="select * from ChuyenDe";
        return  selectBySql(sql);
    }
    
    public chuyende selectById(String maCD){
        String sql="SELECT * FROM ChuyenDe WHERE MaCD=?";
        List<chuyende> list = selectBySql(sql, maCD);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<chuyende> selectByChuyenDe (String macd){
            String sql = "select * from KhoaHoc where MaCD=?";
            return this.selectBySql(sql, macd);
    }
    protected List<chuyende> selectBySql(String sql, Object...args){
        List<chuyende> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = xjdbc.query(sql, args);
                while(rs.next()){
                    chuyende entity=new chuyende();
                    entity.setMaCD(rs.getString("MaCD"));
                    entity.setTenCD(rs.getString("TenCD"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
                    entity.setHinh(rs.getString("Hinh"));
                    entity.setMoTa(rs.getString("MoTa"));
                    
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
    
  
    
}
