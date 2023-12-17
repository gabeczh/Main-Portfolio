public class Account {

    private String number;
    private String name;
    private double balance;

    public Account(){

        number = "";
        name = "";
        balance = 0;
    }

    public Account(String number, String name, double balance){
    
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber(){
    
        return number;
    }

    public void setNumber(String number){
    
        this.number = number;
    }

    public String getName(){
    
        return name;
    }

    public void setName(String name){
    
        this.name = name;
    }

    public double getBalance(){
    
        return balance;
    }

    public void increaseBalance(double amount){
    
        if(amount > 0){
        
            balance = balance + amount;
        }

    }

    public void decreaseBalance(double amount){

        if(amount > 0){
        
            balance = balance - amount;
        }
    
    }

    public String toString(){
    
        return String.format("Account number %s, name %s, current balance is: %.2f\n", number,name,balance);
    }
}
