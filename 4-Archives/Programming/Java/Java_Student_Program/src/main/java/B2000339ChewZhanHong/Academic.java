package B2000339ChewZhanHong;


public class Academic {
    
    private String name;
    private String designation;
    
    Academic(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    
    public String toString(){
        return designation + " " + name;
    }
    
}
