/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

//Reference:
https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
 */
package javanetworking;

import java.net.*;
import java.io.*;

/**
 *
 * @author kito
 */
public class JavaNetworking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the java networking tutorial.");
        InetAddress i;

        try {
           i  = InetAddress.getLocalHost();
           System.out.println("Host: " + i);
           System.out.println("--------------------");
           i = InetAddress.getByName("www.google.com");
           System.out.println("www.google.com " + i.toString());
           
           InetAddress[] inetArray = InetAddress.getAllByName("www.google.com");
           
           for(int j=0;j<inetArray.length;j++){
               System.out.println("www.google.com: " + inetArray[j]);
               
           }
        }
        catch (UnknownHostException e) {
            System.out.println("Unknown host exception: " + e.toString());
            e.printStackTrace();
        }
        
        
        
       
    }  

}
