/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author dinh thang
 */
public class Student {
    String MaSV;
    String Hoten ;
    String Email ;
    String SoDT;
    String Diachi;
    boolean Gioitinh;

    public Student(String MaSV, String Hoten, String Email, String SoDT, String Diachi, boolean Gioitinh) {
        this.MaSV = MaSV;
        this.Hoten = Hoten;
        this.Email = Email;
        this.SoDT = SoDT;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
    }

    Student(String masv, String hoten, String email, String sodt, String diachi, String gt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
