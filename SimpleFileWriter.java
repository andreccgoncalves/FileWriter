/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefilewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author andregoncalves
 */
public class SimpleFileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String filename = "output.txt"; // this is to store the name of my file

        
      // step 1 we will need a BufferedWriter and a FileWriter 
        try {
            
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, false));
            // true = append something to the file
            // false = overwrite the file
            
            myWriter.write("Hi, How are you?");
            // Writing in the file
            
            int someNumber = 84;
            
            // Writing a number
            
            
            myWriter.newLine();
            
            myWriter.write(Integer.toString(someNumber)); // Integer.toString to change the integer to a String
            
            myWriter.close(); // This saves changes to the file!!
             
            
        }
    catch(Exception e) {
        System.out.println("Error writing to file " + filename); // if an error happens, this message will appear in the output
    }
    
}
}
