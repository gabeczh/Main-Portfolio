import java.util.*;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price){
    
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
    
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
    
        return name;
    }

    public Author[] getAuthors(){
    
        return authors;
    }

    public double getPrice(){
    
        return price;
    }

    public void setPrice(double price){

        this.price = price;
    }

    public int getQty(){
    
        return qty;
    }

    public void setQty(int qty){
    
        this.qty = qty;
    }

    public String getAuthorNames(){
    
        String names = "";
        for(Author a: authors){
        
            names = names + "," + a.getName();
        }
        return names;
    }

    public String toString(){
    
        return String.format("Book[name=%s,%s,price=%.2f,qty=%d]", getName(),Arrays.toString(getAuthors()), getPrice(), getQty());
    }
}
