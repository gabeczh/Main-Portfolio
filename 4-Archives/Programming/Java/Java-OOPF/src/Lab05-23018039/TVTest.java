import java.util.*;

public class TVTest {

    public static void main(String[] args){
    
        Scanner myInput = new Scanner(System.in);
        TV tv1 = new TV("S101","Elba",'R',1400);

        System.out.println("Enter a price: ");
        tv1.setPrice(myInput.nextInt());

        System.out.println(tv1.calculateTax(10));
    }
}

