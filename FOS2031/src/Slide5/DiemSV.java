/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;
/**
 *
 * @author Tu Ech
 */
public class DiemSV {
    int ID; 
    String MASV; 
    String Hoten;
    int Tienganh; 
    int Tinhoc; 
    int GDTC; 
    double DiemTB;
    public DiemSV(int ID, String MASV, String Hoten,int Tienganh, int Tinhoc, 
            int GDTC, double DiemTB) {
        this.ID = ID;
        this.MASV = MASV;
        this.Hoten = Hoten;
        this.Tienganh = Tienganh;
        this.Tinhoc = Tinhoc;
        this.GDTC = GDTC;
        this.DiemTB=DiemTB;
    }  
}
