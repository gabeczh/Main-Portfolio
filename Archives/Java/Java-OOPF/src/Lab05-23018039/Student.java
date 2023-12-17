public class Student {

    //Declare Variables
    private String name;
    private int semester;
    private String course;

    //Constructors
    //Default
    public Student(){
    
        name = "";
        semester = 1;
        course = "";
    }

    //Complete
    public Student(String name, int semester, String course){
    
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    //Setter/Getter Methods
    public String getName(){
    
        return name;
    }

    public void setName(String name){
    
        this.name = name;
    }

    public int getSemester(){
    
        return semester;
    }

    public void setSemester(){
    
        this.semester = semester;
    }

    public String getCourse(){
    
        return course;
    }

    public void setCourse(String course){

        this.course = course;
    }

    public boolean checkEligibility(){
    
        if(semester >=4 && semester <=6){
        
            return true;
        }
        else {
        
            return false;
        }
    }

    public String toString(){
    
        return String.format("Student with name %s studies course %s in semester %d",
                name,course,semester);
    }
}
