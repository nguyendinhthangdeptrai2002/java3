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
public class khoahoc {
    
    private int makh;
    private String macd ;
    private double hocphi;
    private  int thoiluong;
    private Date ngaykg;
    private  String ghichu;
    private String manv ;
    private Date ngaytao;

    
    @Override
        public String toString() {
        return this.macd + " (" + this.ngaykg + ")";
    }
   
    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getMacd() {
        return macd;
    }

    public void setMacd(String macd) {
        this.macd = macd;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public Date getNgaykg() {
        return ngaykg;
    }

    public void setNgaykg(Date ngaykg) {
        this.ngaykg = ngaykg;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }
    
}
