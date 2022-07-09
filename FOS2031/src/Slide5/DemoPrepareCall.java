/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class DemoPrepareCall {
    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EMPDB";
            Connection con = DriverManager.getConnection(url,"sa","123");                       
            String sql="{call getEmpName (?, ?)}";
            CallableStatement stmt = con.prepareCall(sql);           
            int empID = 3;
            stmt.setInt(1, empID);          
            stmt.registerOutParameter(2, java.sql.Types.NVARCHAR);
            System.out.println("Executing stored procedure...");
            stmt.execute();
            String empName = stmt.getString(2);
            System.out.println("Emp name with ID (" + empID + ") is " + empName);
            stmt.close();con.close();
        }catch(Exception e){
            System.out.println(e);          
        }
    }
}
