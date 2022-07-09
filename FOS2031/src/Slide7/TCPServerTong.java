/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Administrator
 */
public class TCPServerTong {

    public static void main(String[] args) throws IOException {
        String s;
        String capitalizedSentence;
        ServerSocket welcomeSocket = new ServerSocket(6789);
        while(true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(
                    new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(
                    connectionSocket.getOutputStream());
            s = inFromClient.readLine();
            double t = 0;
            for(int i=0;i<s.length();i++){
                char x = s.charAt(i);
                String n = String.valueOf(x);
                t += Double.parseDouble(n); 
                //System.out.println(t);
            }        
                       
            //capitalizedSentence = s.toUpperCase() + '\n';
            //outToClient.writeBytes(capitalizedSentence);
            outToClient.writeDouble(t);
            outToClient.flush();
        }
    }
}
