/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

//Reference:
https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
Creating an object:  MyObject object = new MyObject();
Factory Methods:
https://stackoverflow.com/questions/24277032/inetaddress-direct-instantiation
Three commonly used InetAddress factory methods are shown here :-

static InetAddress getLocalHost() throws UnknownHostException
static InetAddress getByName(String hostName) throws UnknownHostException
static InetAddress[] getAllByName(String hostName) throws UnknownHostException



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
           
           //The ide is sugessting to use the enhanced for loop.
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
