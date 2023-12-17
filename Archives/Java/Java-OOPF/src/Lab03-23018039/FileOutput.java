import java.io.*;
import java.lang.*;
import java.util.*;

public class FileOutput {

    public static void main(String[] args){
    
        Scanner myInput;
        try{
        
            myInput = new Scanner(new File("students.txt"));
            while(myInput.hasNext()){

                System.out.printf("%-15s%-10d\n", myInput.next(), myInput.nextInt());
            }
            if(myInput != null){
            
                myInput.close();
            }
        }catch(FileNotFoundException fe){
        
            System.out.println("Error Opening File.");
        }
        catch(NoSuchElementException ex){
        
            System.out.println("File Improperly Formed.");
        }
    }
}
