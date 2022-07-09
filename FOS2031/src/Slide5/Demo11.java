/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class Demo11 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mydb";
            Connection con = DriverManager.getConnection(url,"sa","123");
            Statement stm = con.createStatement();
            String sql="select * from Employees";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getInt(1)+"-"+ rs.getString(2));
                System.out.println("-"+rs.getString("last")+"-"+ rs.getInt("age"));
            }
            rs.close();stm.close();con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
