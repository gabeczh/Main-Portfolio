import java.util.Scanner;

public class Num2 {
    public static void main(String[] args){
        int nums;

        Scanner myInput = new Scanner(System.in);

        System.out.printf("Enter five numbers: ");
        nums = myInput.nextInt();

        int num1 = nums/10000;
        int num2 = (nums % 10000) / 1000;
        int num3 = (nums % 1000) /100;
        int num4 = (nums % 100) / 10;
        int num5 = (nums % 10);

        System.out.printf("Digits in %d Are ", nums);
        System.out.printf("%d %d %d %d %d",num1,num2,num3,num4,num5);
    }
}
