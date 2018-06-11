/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;


import java.lang.System;
/**
 *
 * @author kito
 */
public class DateAndTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the date and time tutorial.");
        
        int i;
        long startTime,endTime,diff;
        
        //Start the timer
        startTime = System.nanoTime();
        for(i=0; i < 58987;i++){
            
        }
        endTime = System.nanoTime();
        diff = (endTime - startTime);
        
        System.out.println("The estimated elapse time was: " + diff + " nanoseconds");
        
       /*
        To get the current date info can be found at the following url
        https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
        */
    }
    
}
