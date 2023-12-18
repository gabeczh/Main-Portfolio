public class SupplierAccount extends Account {

    String SupplierType;

    public SupplierAccount(){
    
        super();
        SupplierType = "";
    }

    public SupplierAccount(String number, String name, double balance, String st){
    
        super(number, name, balance);
        SupplierType = st;
    }

    public String getSupplierType(){
    
        return SupplierType;
    }

    public void setSupplierType(String supplierType){
    
        SupplierType = supplierType;
    }

    public void increaseBalance(double amount){
    
        if(SupplierType.equals("VIP")){
        
            super.increaseBalance(amount * 2);

        }else{
        
            super.increaseBalance(amount);
        }
    }

    public void sellItem(int qty, double price){
    
        increaseBalance(price * qty);
    }

    public String toString(){
    
        return String.format("Supplier: type %s %s", SupplierType, super.toString());
    }
}
