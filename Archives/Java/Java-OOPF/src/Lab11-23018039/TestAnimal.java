import java.util.*;

public class TestAnimal {

    public static void main(String[] args){
    
        ArrayList<Animal> alist = new ArrayList<Animal>();

        Dog d1 = new Dog("Bobo", 4);
        Dog d2 = new Dog("Esther", 4);
        Bird b = new Bird("Birdie", 2);
        Fish f1 = new Fish("Fifi", 0, "Fresh");
        Fish f2 = new Fish("Dorry", 0, "Salt");

        alist.add(d1);
        alist.add(d2);
        alist.add(b);
        alist.add(f1);
        alist.add(f2);

        for(Animal a: alist){
        
            a.Eat();

            if(a instanceof Dog){
            
                a.Move(20);
            }else{
            
                if(a instanceof Fish){

                    if(((Fish) a).getType().equals("Salt")){
                    
                        a.Move(50);
                    }else{
                    
                        a.Move(10);
                    }

                }else{

                    a.Move(10);
                }
            }
        }

       /* 

        System.out.println(d1);
        d1.Eat();
        d1.Run();

        System.out.println(d2);
        d2.Eat();
        d2.Run();

        System.out.println(b);
        b.Eat();
        b.Fly();
        b.Sing();

        System.out.println(f1);
        f1.Eat();
        f1.Swim();

        System.out.println(f2);
        f2.Eat();
        f2.Swim();

        */



    }
}
