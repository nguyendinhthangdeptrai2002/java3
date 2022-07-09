/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import com.sun.corba.se.spi.activation.Server;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author dinh thang
 */
public class bai1_server {
    
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("server is connecting");
            Socket socket =  serverSocket.accept();
            System.out.println("server is connect");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream  outputStreamputStream = new DataOutputStream(socket.getOutputStream());           
            while (true){
                double number1 = inputStream.readDouble();
                double number2 = inputStream.readDouble();
                System.out.println("2 số nhận được từ client là "+number1+" "+number2);
                Double sum = number1+number2;
                outputStreamputStream.writeDouble(sum);
                outputStreamputStream.flush();
                System.out.println("tổng  2 số là :"+sum);
            }
        } catch (Exception ec) {
            ec.printStackTrace();
        }
    }
}
