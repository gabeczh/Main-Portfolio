public class Invoice{

    private String partNum;
    private String partDesc;
    private int quantity;
    private double price;

    public Invoice(){
    
        partNum = "";
        partDesc = "";
        quantity = 0;
        price = 0;
    }

    public Invoice(String partNum, String partDesc, int quantity, double price){
    
        setPartNum(partNum);
        setPartDesc(partDesc);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setPartNum(String partNum){
    
        this.partNum = partNum;
    }

    public String getPartNum(){
    
        return partNum;
    }

    public void setPartDesc(String partDesc){
    
        this.partDesc = partDesc;
    }

    public String getPartDesc(){
    
        return partDesc;
    }

    public void setQuantity(int quantity){
    
        if(quantity < 0){
        
            quantity = 0;
        }else{
        
            this.quantity = quantity;
        }
    }

    public int getQuantity(){
    
        return quantity;
    }

    public void setPrice(double price){
    
        if(price < 0){
        
            price = 0;
        }else{
        
            this.price = price;
        }
    }

    public double getPrice(){
    
        return price;
    }

    public double getInvoiceAmount(){
    
        return getQuantity() * getPrice();

    }

    public String toString(){
    
        return String.format("Part Number:%s\n Part Description: %s\n Quantity: %d\n Price: %.2f\n Invoice Amount: %.2f\n",
                getPartNum(), getPartDesc(), getQuantity(), getPrice(), getInvoiceAmount());
    }
}
