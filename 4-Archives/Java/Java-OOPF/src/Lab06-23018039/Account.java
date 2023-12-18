public class Account{

    private double balance;
    private static double total;

    public Account(double initialBalance){
    
       // balance = initialBalance;
       setBalance(initialBalance);
       increaseTotal(initialBalance);
    }

    public void setBalance(double b){
    
        if(b > 0){
        
            balance = b;
        }
    }

    public double getBalance(){
    
        return balance;
    }

    public void credit(double amount){
    
       //balance = balance + amount;
       setBalance(balance + amount);
       increaseTotal(amount);
    }

    public void debit(double amount){
    
        if(amount > balance){
        
            System.out.println("Debit amount exceeded account balance.");
        }
        else {
        
           //balance = balance - amount;
           setBalance(balance - amount);
           decreaseTotal(amount);
        }

    }

    public static void increaseTotal(double amount){
    
        total = total + amount;
    }

    public static void decreaseTotal(double amount){
    
        total = total - amount;
    }

    public static double getTotal(){
    
        return total;
    }


}
