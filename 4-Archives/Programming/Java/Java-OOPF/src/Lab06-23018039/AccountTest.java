import java.util.*;

public class AccountTest{

    public static void main(String[] args){

        double num;
        Scanner myInput = new Scanner(System.in);

        System.out.print("Account 1 Balance:$ ");
        num = myInput.nextDouble();
        Account account1 = new Account(num);
        System.out.print("Account 2 Balance:$ ");
        num = myInput.nextDouble();
        Account account2 = new Account(num);

        System.out.printf("Account 1 Balance: %.2f\n", account1.getBalance());
        System.out.printf("Account 2 Balance: %.2f\n", account2.getBalance());

        System.out.print("Enter amount to be deposited for Account 1:$ ");
        num = myInput.nextDouble();
        account1.credit(num);
        System.out.print("Enter amount to be deposited for Account 2:$ ");
        num = myInput.nextDouble();
        account2.credit(num);
        
        System.out.printf("Account 1 Balance: %.2f\n", account1.getBalance());
        System.out.printf("Account 2 Balance: %.2f\n", account2.getBalance());

        System.out.print("Enter amount to be withdrawn for Account 1:$ ");
        num = myInput.nextDouble();
        account1.debit(num);
        System.out.print("Enter amount to be withdrawn for Account 2:$ ");
        num = myInput.nextDouble();
        account2.debit(num);

        System.out.printf("Account 1 Balance: %.2f\n", account1.getBalance());
        System.out.printf("Account 2 Balance: %.2f\n", account2.getBalance());

        System.out.printf("Total Balance of all Accounts is: %.2f\n", Account.getTotal());


    }
}
