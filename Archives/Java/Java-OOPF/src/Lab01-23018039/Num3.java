import java.util.Scanner;

public class Num3 {

    public static void main(String[] args){

        int num;

        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
    
        num = myInput.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is even"); 
        }
        else {
            System.out.println("Number is odd");
        }
    }

}
