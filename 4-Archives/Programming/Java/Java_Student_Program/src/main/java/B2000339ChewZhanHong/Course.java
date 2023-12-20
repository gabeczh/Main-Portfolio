package B2000339ChewZhanHong;




public class Course {
    private String name;
    private String code;
    
    Course(String name, String code){
        this.name = name;
        this.code = code;
    }
    
    public String toString() {
        return code + ": " + name;
    }
}
