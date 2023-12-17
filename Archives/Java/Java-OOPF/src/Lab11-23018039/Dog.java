public class Dog extends Animal {

    public Dog(String name, int leg){
    
        super(name, leg);
    }

    public void Move(int m){

        super.Move(m);
        System.out.printf("Running %d meter\n\n",getMeter());
    }

    public String toString(){
    
        return String.format("Dog [%s]", super.toString());
    }
}
