public class Bird extends Animal {

    public Bird(String name, int leg){
    
        super(name, leg);
    }

    public void Sing(){
    
        System.out.println("Singing\n");
    }

    public void Move(int m){
    
        super.Move(m);
        System.out.printf("Flying %d meter\n\n", getMeter());
    }

    public String toString(){
    
        return String.format("Bird [%s]", super.toString());
    }
}
