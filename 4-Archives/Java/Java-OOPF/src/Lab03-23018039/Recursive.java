import java.util.*;

public class Recursive {

    public static void main(String[] args){
    
        //Declare Variables
        int result;
        int num;

        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = myInput.nextInt();

        result = sum(num);
        System.out.println("Result is  " + result);
    }

    public static int sum(int n){
    
        //Base case
        if(n == 1){
        
            return 1;
        }
        else {
        
            //Recursive step
            return (n + sum(n-1));
        }
    }
}
