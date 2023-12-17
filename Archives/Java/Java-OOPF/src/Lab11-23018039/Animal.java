public class Animal {

    private String name;
    private int leg;
    private int meter = 0;

    public Animal(String name, int leg){
    
        this.name = name;
        this.leg = leg;
    }

    public String getName(){
    
        return name;
    }

    public void setName(String name){
    
        this.name = name;
    }

    public int getLeg(){
    
        return leg;
    }

    public void setLeg(int leg){
    
        this.leg = leg;
    }

    public int getMeter(){
    
        return meter;
    }

    public void setMeter(int meter){

        this.meter = meter;
    }

    public void Eat(){
    
        System.out.println("Eating\n");
    }

    public void Move(int m){
    
        meter = meter + m;
    }

    public String toString(){
    
        return String.format("name=%s, leg=%s, meter=%s", name,leg,meter);
    }
}
