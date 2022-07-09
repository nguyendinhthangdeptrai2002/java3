/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobaovejava3;

import java.util.Date;

/**
 *
 * @author dinh thang
 */
public class sinhvien {
    String  masv;
     String Tensv;
     Date ngaysinh;
    String sodt ;
   boolean gioiTinh;
     String diachi;
    String Date;



    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public sinhvien(String masv, String Tensv, Date ngaysinh, String sodt, String diachi) {
        this.masv = masv;
        this.Tensv = Tensv;
        this.ngaysinh = ngaysinh;
        this.sodt = sodt;
        this.diachi = diachi;
    }

    public sinhvien() {
       
    }

   
    
}
