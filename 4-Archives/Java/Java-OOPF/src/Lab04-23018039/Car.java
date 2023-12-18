public class Car {

    private String brand;
    private String colour;
    private int engine_size;
    private int speed;

    //Constructor Method
    //Default Constructor
    public Car(){
    
        brand = "no brand";
        colour = "white";
        engine_size = 2;
        speed = 0;
    }

    //Complete Constructor
    Car(String brand, String colour, int engine_size, int speed){
    
        brand = brand;
        colour = colour;
        engine_size = engine_size;
        speed = speed;
    }

    //Getter/Setter Methods
    public String getBrand(){
    
        return brand;
    }

    public void setBrand(String brand){

        brand = brand;
    }

    public String getColour(){
    
        return colour;
    }

    public void setColour(String colour){

        colour = colour;
    }

    public int getEngine_Size(){
    
        return engine_size;
    }

    public void setEngine_Size(int engine_size){
    
        engine_size = engine_size;
    }

    public int getSpeed(){
    
        return speed;
    }

    public void setSpeed(int speed){
    
        speed = speed;
    }

    //Additional Methods

    public void accelerate(){
    
        speed = speed + 1;
    }

    public void decelerate(){
    
        speed = speed - 1;
    }

    public void stop(){
    
        speed = 0;
    }

    //ToString
    public String toString(){

        return String.format("The Car Brand with %s, Colour %s, Engine Size %d is running at Speed of %d ",
                brand,colour,engine_size,speed);
    }


}
