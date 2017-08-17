/*
This is the application log file: ApplicationLg.java
 */
package applicationlog;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author kito
 */
public class ApplicationLog {

    private static final Logger applog = Logger.getLogger(ApplicationLog.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the application log");
        applog.log(Level.WARNING,"This is the start of the application log.");
        
        //Setup file application log
        FileHandler fh;
        try{
            fh = new FileHandler("C:\\Users\\kito\\Documents\\NetBeansProjects\\ApplicationLog.txt",true);
            applog.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        }
        catch(IOException e){
            System.out.println("There was an IO exeception" + e);
        }
        
        applog.info("This is the start of the application: ApplicationLog.java");
        
        //Start of the appication 
       try{
                   TimeUnit.SECONDS.sleep(13);
       }
       catch(InterruptedException e){
           System.out.println("InterruptedException : "+ e.toString());
       }
        
        applog.info("The application has ended now");
        
        
        
        
    }

}
