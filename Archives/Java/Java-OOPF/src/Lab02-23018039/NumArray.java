import java.util.*;

public class NumArray {

    public static void main(String[] args){
    
        //Define Variables
        int[] nums;
        int size;
        Scanner myInput = new Scanner(System.in);

        //Array Size Input
        System.out.print("How many numbers would you like to enter: ");
        size = myInput.nextInt();

        //Array Variable
        nums = new int[size];

        int count = 0;
        int num;

        //While Loop
        while(count < nums.length){
        
            //Initial Input
            System.out.print("\nEnter a number: ");
            num = myInput.nextInt();

            //If Statement Checker
            if((num >= 10) && (num <= 100)){

                boolean hasNum = false;
                for(int i = 0; i < nums.length; i++){
                    if(num == nums[i]){
                        hasNum = true;
                        break;
                    }
                }
                if(!hasNum){
                    nums[count] = num;
                    count++;
                }
                else {
                    System.out.printf("%d has already been entered\n",num);
                }

            }
            else {
                System.out.println("Number must be between 10 and 100");
            }


            //For Loop/End Statement
            for(int i = 0; i < count; i++){
            
                System.out.print(nums[i] + " ");
            }
        }
    }

}
