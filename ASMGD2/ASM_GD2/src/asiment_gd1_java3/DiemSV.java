/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asiment_gd1_java3;

/**
 *
 * @author dinh thang
 */
public class DiemSV {
    int ID ;
    String MASV;
    String Hoten;
    int Tienganh;
    int Tinhoc;
    int GDTC;

    public DiemSV(int ID, String MASV, String Hoten, int Tienganh, int Tinhoc, int GDTC) {
        this.ID = ID;
        this.MASV = MASV;
        this.Hoten = Hoten;
        this.Tienganh = Tienganh;
        this.Tinhoc = Tinhoc;
        this.GDTC = GDTC;
    }

    DiemSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
