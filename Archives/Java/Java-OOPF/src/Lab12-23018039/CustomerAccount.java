public class CustomerAccount extends Account {

    public CustomerAccount(){
    
        super();
    }

    public CustomerAccount(String number, String name, double balance){
    
        super(number, name, balance);
    }

    public Boolean checkBalance(double total){
    
        if(getBalance() > total){
        
            return true;
        }else{
        
            return false;
        }
    }

    public void buyItem(int qty, double price){
    
        if(checkBalance(qty * price)){

            decreaseBalance(qty * price);
        }else{
        
            System.out.println("Not enough money to buy this item\n");
        }
    }

    public void ReceivePayment(double amt){
    
        increaseBalance(amt);
    }

    public String toString(){
    
        return String.format("Customer: %s", super.toString());
    }
}
