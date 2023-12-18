import java.util.*;

public class AccountTest {

    public static void main(String[] args){
    
        ArrayList<Account> alist = new ArrayList<Account>();

        Account acc1 = new Account("A001","Pensonic",0);
        SupplierAccount Sacc1 = new SupplierAccount("S001","Jones",0,"VIP");
        SupplierAccount Sacc2 = new SupplierAccount("S002","Albert",0,"Normal");
        CustomerAccount Cacc1 = new CustomerAccount("C001","Daniel",1000);

        alist.add(acc1);
        alist.add(Sacc1);
        alist.add(Sacc2);
        alist.add(Cacc1);

        for(Account a: alist){
        
            if(a instanceof SupplierAccount){
            
                ((SupplierAccount) a).sellItem(100,5.8);
            }
            if(a instanceof CustomerAccount){
            
                CustomerAccount temp = (CustomerAccount) a;
                temp.buyItem(7,250.30);
                temp.ReceivePayment(200);
            }
            System.out.println(a);
        }
    }
}
