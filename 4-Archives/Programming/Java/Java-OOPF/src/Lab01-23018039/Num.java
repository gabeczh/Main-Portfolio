import java.util.Scanner; //Import scanner

public class Num {
    public static void main(String[] args){
        //declare variables

        int num1,num2,num3;

        int sum,product,largest,smallest;

        float average;

        //declare your scanner
        
        Scanner myInput = new Scanner(System.in);

        //Read input from user
        System.out.println("Enter first number: ");
        num1 = myInput.nextInt();
        System.out.println("Enter second number: ");
        num2 = myInput.nextInt();
        System.out.println("Enter third number: ");
        num3 = myInput.nextInt();

        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;
        average = (float) sum / 3;

        //Compare and get largest num
        largest = num1;
        if (num2 > largest){
            largest = num2;
        }
        if (num3 > largest){
            largest = num3;
        }

        //Compare and get smallest num
        smallest = num1;
        if (num2 < smallest){
            smallest = num2;
        }
        if (num3 < smallest){
            smallest = num3;
        }

        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Product is %d\n", product);
        System.out.printf("Average is %.2f\n ", average);
        System.out.printf("Smallest is %d\n", smallest);
        System.out.printf("Largest is %d\n", largest);

    }


}
