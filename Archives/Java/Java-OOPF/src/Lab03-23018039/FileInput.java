import java.util.*;
import java.io.*;
import java.lang.*;

public class FileInput {

    public static void main(String[] args){
    
        Formatter output;
        String name;
        int mark;

        Scanner myInput = new Scanner(System.in);

        try {
        
            output = new Formatter("students.txt");
            do {
            
                System.out.print("Enter name: ");
                name = myInput.next();
                System.out.print("Enter mark:  ");
                mark = myInput.nextInt();
                if(mark != -1){
                
                    output.format("%s %d\r\n", name, mark);
                }
            }while(mark != -1);

            if(output != null){
            
                output.close();
            }
        }catch(SecurityException se){

            System.out.println("You do not have write access");
            System.exit(1);
        }catch(FileNotFoundException fe){
        
            System.out.println("Error Opening/Creating File.");
            System.exit(1);
        }
    }
}
