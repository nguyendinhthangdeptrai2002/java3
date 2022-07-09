/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TuEch
 */
public class DemoDatabaseMetaData {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://localhost;databaseName=EMPDB;user=sa;password=123";
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
              System.out.println("Connected");
              DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
              System.out.println("Driver name: " + dm.getDriverName());
              System.out.println("Driver version: " + dm.getDriverVersion());
              System.out.println("Product name: " + dm.getDatabaseProductName());
              System.out.println("Product version: " + dm.getDatabaseProductVersion()); 
            }
        }catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
}
