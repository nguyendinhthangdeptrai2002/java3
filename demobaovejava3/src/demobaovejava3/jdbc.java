/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobaovejava3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author dinh thang
 */
public class jdbc {
    
  private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  private static  String Url ="jdbc:sqlserver://localhost;database=EduSys";
  private static  String username ="sa";
  private static  String password ="songlong";
    
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static PreparedStatement getstmt(String sql, Object...args)throws  SQLException{
        Connection connection =DriverManager.getConnection(Url,username,password);
        PreparedStatement pstmt =null;
        if(sql.trim().startsWith("{")){
            
            pstmt = connection.prepareCall(sql);
        }
        else{
            pstmt = connection.prepareStatement(sql);
        }
        for (int i=0;i<args.length;i++){
            pstmt.setObject(i+1, args[i]);
        }
        return pstmt;
    }
    public static void update(String sql,Object...args){
        try {
             PreparedStatement  stmt = jdbc.getstmt(sql, args);
             try {
                stmt.executeUpdate();
            }
             finally  {
                 stmt.getConnection().close();
            }
        }
             catch (Exception e) {
        }
    }
    
    public static ResultSet query(String sql,Object...args){
        try {
            
            PreparedStatement stmt = jdbc.getstmt(sql, args);
            return  stmt.executeQuery();
        } 
        catch (SQLException e) {
            throw  new  RuntimeException();
        }
    }
    
    public static Object value(String sql ,Object...args){
        try {
             ResultSet rs = jdbc.query(sql, args);
             if(rs.next()){
                 return  rs.getObject(0);
                 
             }
             rs.getStatement().getConnection().close();
             return null;
             
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
}
