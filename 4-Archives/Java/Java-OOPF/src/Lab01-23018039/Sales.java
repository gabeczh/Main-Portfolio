import java.util.*;

public class Sales{
    
    public static void main(String[] args){
    
        //Product1 = 2.98, Product2 = 4.50, Product3 = 9.98

        Scanner myInput = new Scanner(System.in);

        //Quantity Variable
        double product1 = 0, product2 = 0, product3 = 0;
        double price1 = 2.98, price2 = 4.50, price3 = 9.98;
        int productid = 1;

        //While Loop
        while(productid != 0)
        {
            //Initial Input Statement
            System.out.println("Enter product number (1-3) (0 to stop): ");
            productid = myInput.nextInt();
            
            //If Statement for Product ID
            if(productid>=1 && productid<=3){
            
                System.out.println("Enter quantity sold: ");
                
                int quantity = myInput.nextInt();

                //Switch Case
                switch(productid)
                {
                
                    case 1:
                        product1 = product1+quantity*price1;
                        break;
                    case 2:
                        product2 = product2+quantity*price2;
                        break;
                    case 3:
                        product3 = product3+quantity*price3;
                        break;
                    default:
                        System.out.println("Wrong product code!\n");
                        break;

                }
            }

        }

        //Summary Statement

        System.out.println();
        System.out.printf("Product 1: $%.2f\n",product1);
        System.out.printf("Product 2: $%.2f\n",product2);
        System.out.printf("Product 3: $%.2f\n",product3);
    }

}
