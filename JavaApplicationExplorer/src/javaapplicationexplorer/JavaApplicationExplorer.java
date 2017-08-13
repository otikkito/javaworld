/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//The Java api : http://docs.oracle.com/javase/8/docs/api/
//Java coding style : http://www.oracle.com/technetwork/java/codeconvtoc-136057.html
/*
object instantiation:
ClassTemplateName objectName = new CassTemlateName(...)

access methods and variables:
objectName.<variable name>
objectName.<method name>

*/
package javaapplicationexplorer;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

/**
 *
 * @author kito
 */
public class JavaApplicationExplorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //data type declaration
        int i;
        int[] array = new int[10];
        BufferedReader br;
        br = null;
        
        //opbject instantiation
        StringBuilder s = new StringBuilder("This is a string");
        Random rand = new Random();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\kito\\Documents\\NetBeansProjects\\java-app.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("Unabe to find the file" + e.toString());
        }
        
        
        System.out.println(s.toString());
        s.append("fgfg");
        System.out.println(s.toString());
        i=3;
        array[0] = rand.nextInt(50);
        System.out.println("The value of array[0] is: " + array[0]);
        
        try{
           String line;
           while((line = br.readLine()) != null){
               System.out.println(line); 
           }
           
        }
        catch(IOException e){
            System.out.println("IOException: " + e);
        }
        
        
        /*Cool feature to split up the string with multiple spaces using split and regex*/
        String k;
        k = "This  is a string     with multiple  spaces";
        String[] arrayString = k.split(" +");
        
        int g;
        for(g=0; g < arrayString.length;g++){
            System.out.println("token " + g + ":" + arrayString[g]);
        }
        
        
        
         
    }
    
}
