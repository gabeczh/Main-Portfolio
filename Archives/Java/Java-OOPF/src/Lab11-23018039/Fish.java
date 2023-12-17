public class Fish extends Animal {

    private String waterType;

    public Fish(String name, int leg, String waterType){
    
        super(name,leg);
        this.waterType = waterType;
    }

    public String getType(){
    
        return waterType;
    }

    public void setType(String waterType){
    
        this.waterType = waterType;
    }

    public void Move(int m){
    
        super.Move(m);
        System.out.printf("Swimming %d meter\n\n", getMeter());
    }

    public String toString(){
    
        return String.format("Fish [%s, waterType=%s]", super.toString(),waterType);
    }
}
