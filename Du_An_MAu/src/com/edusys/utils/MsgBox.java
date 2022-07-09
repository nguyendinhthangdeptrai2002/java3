/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author dinh thang
 */
public class MsgBox {
    
    public static void alert(Component parentComponent,String message ){
        JOptionPane.showMessageDialog(parentComponent, message,
               "hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE );  
    }
    public static boolean confirm(Component parentComponent, String message){
        int result= JOptionPane.showConfirmDialog(parentComponent, message,
                "Hệ thống quản lý đào tạo", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result ==JOptionPane.YES_OPTION;
}
    public static String prompt (Component parent ,String message ){
        return JOptionPane.showInputDialog(parent, message,
                "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
