/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.utils.xjdbc;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinh thang
 */
public class ThongKeDAO {
    
    private  List<Object[]> getListofArray(String sql ,String[] cols ,Object...arg){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = xjdbc.query(sql, arg);
            while(rs.next()){
                   Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return  list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    public List<Object[]> getBangDiem(Integer makh){
        String sql ="{CALL sp_BangDiem (?)}";
        String[] cols =  {"MaNH", "HoTen", "Diem"};
        return getListofArray(sql, cols, makh);
    }
    public List<Object[]> getLuongNguoiHoc(){
        String sql ="{CALL sp_LuongNguoiHoc}";
        String[] cols ={"Nam","SoLuong","DauTien","CuoiCung"};
        return this.getListofArray(sql, cols);
    }
    public List<Object[]>getDiemChuyenDe(){
        String sql = "{CALL sp_DiemChuyenDe}";
        String[] cols = {"ChuyenDe","SoHV","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListofArray(sql, cols);
        
    }
    public List<Object[]> getDoanhthu(int nam){
        String sql ="{CALL sp_DoanhThu (?)}";
        String[] cols ={"ChuyenDe","SoKH","SoHV","DoanhThu","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListofArray(sql, cols,nam);
    }

    
}
