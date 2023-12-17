public class TV {

    private String stockNum;
    private String make;
    private char screenType;
    private double price;

    //Constructors
    //Default
    public TV(String stockNum, String make, char screenType, double price){
    
        this.stockNum = stockNum;
        this.make = make;
        this.screenType = screenType;
        this.price = price;
    }

    public void setPrice(double price){

        this.price = price;
    }

    public String getStockNum(){
    
        return stockNum;
    }

    public String getMake(){
    
        return make;
    }

    public char getScreenType(){
    
        return screenType;
    }

    public double getPrice(){
    
        return price;
    }

    public double calculateTax(double rateIn){
    
        return price * rateIn/100;
    }


}
