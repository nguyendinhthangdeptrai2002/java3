/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author dinh thang
 */
public class bai1_cient {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("Client is Connection...");
            Socket socket = new Socket("localhost", 8888);
            System.out.println("Client is conect");
            DataOutputStream outputStream = new DataOutputStream( socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            while(true){
                System.out.println("nhập vào số 1 : ");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                outputStream.flush();
                System.out.println("nhập vào số 2 :");
                outputStream.writeDouble(new Scanner(System.in).nextDouble());
                outputStream.flush();
                System.out.println("tổng 2 số :"+ inputStream.readDouble());
                System.out.println("tiếp tục (y/n)?:");
                String traloi = new  Scanner(System.in).nextLine();
                if(traloi.equals("n")|| traloi.equals("N")){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
