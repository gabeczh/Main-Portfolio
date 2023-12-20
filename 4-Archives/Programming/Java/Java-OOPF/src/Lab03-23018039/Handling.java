import java.util.*;

public class Handling {

    public static void main(String[] args){
    
        //Declare Variables
        int[] nums = new int[5];
        int result;

        Scanner myInput = new Scanner(System.in);

        try {
        
            //Ask user to enter number to array
            for(int i=0;i<5;i++){
            
                System.out.println("Enter numbers: ");
                nums[i] = myInput.nextInt();
            }
            //Write a statement to divide a number with zero
            result = nums[0] / nums[1];

            //Try to access the element 6 in the array
            nums[5] = 10;
        }
        catch(InputMismatchException e){
        
            System.out.println("Wrong input format");
        }
        catch(ArithmeticException e){
        
            System.out.println("Cannot be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
        
            System.out.println("Index out of bounds");
        }
        catch(Exception e){
        
            System.out.println("Error:" + e);
        }
    }
}
