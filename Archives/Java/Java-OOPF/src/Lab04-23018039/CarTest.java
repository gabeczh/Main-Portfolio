import java.util.*;

public class CarTest{

    public static void main(String[] args){

        ArrayList<Car> carList = new ArrayList<Car>();
    
        //Declare Variables
        Car car1 = new Car();
        Car car2 = new Car("BMW", "black", 15, 10);
        Car car3 = new Car("KIA", "red", 5, 8);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);

        System.out.printf("The colours for the cars are %s, %s, %s\n",
                car1.getColour(), car2.getColour(), car3.getColour());

        //Testing Setters
        /*
        car1.setBrand("Smoke");
        car1.setColour("Blue");
        car1.setEngine_Size(4);
        car1.setSpeed(10);

        car2.setBrand("Dicez");
        car2.setColour("White");
        car2.setEngine_Size(25);
        car2.setSpeed(30);

        car3.setBrand("Vinni");
        car3.setColour("Green");
        car3.setEngine_Size(15);
        car3.setSpeed(20);
        */
        //Testing Additional Methods
        car1.accelerate();
        System.out.println("Car 1 at Speed of " + car1.getSpeed() + " \n");
        car1.decelerate();
        System.out.println("Car 1 at Speed of " + car1.getSpeed() + " \n");
        car1.stop();
        System.out.println("Car 1 at Speed of " + car1.getSpeed() + " \n");

        car2.accelerate();
        System.out.println("Car 2 at Speed of " + car2.getSpeed() + " \n");
        car2.decelerate();
        System.out.println("Car 2 at Speed of " + car2.getSpeed() + " \n");
        car2.stop();
        System.out.println("Car 2 at Speed of " + car2.getSpeed() + " \n");

        car3.accelerate();
        System.out.println("Car 3 at Speed of " + car3.getSpeed() + " \n");
        car3.decelerate();
        System.out.println("Car 3 at Speed of " + car3.getSpeed() + " \n");
        car3.stop();
        System.out.println("Car 3 at Speed of " + car3.getSpeed() + " \n");

        for(Car c: carList){
        
            c.accelerate();
            c.accelerate();
            c.accelerate();
            System.out.println(c);
        }

    }

}
