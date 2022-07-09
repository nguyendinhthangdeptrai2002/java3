/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author dinh thang
 */
public class lab5bai1 {
    
    public static void main(String[] args) {
        try {
            String user="sa";
            String pass="123";
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QLSINHVIEN";
            Connection con =DriverManager.getConnection(url,"sa","123");
            String sql="select * from STUDENTS";      
            java.sql.Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()){
                System.out.print(rs.getString("MaSV")+",");
                  System.out.print(rs.getString("Hoten")+",");
                    System.out.print(rs.getString("Email")+",");
                      System.out.print(rs.getString("SoDT")+",");
                        System.out.println(rs.getString("Gioitinh"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
