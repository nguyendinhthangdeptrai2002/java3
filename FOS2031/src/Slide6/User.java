/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide6;

/**
 *
 * @author Teo
 */
public class User {
    String username;
    String password;
    String role;

    public User() {
        this.username = "";
        this.password = "";
        this.role = "";
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
}
