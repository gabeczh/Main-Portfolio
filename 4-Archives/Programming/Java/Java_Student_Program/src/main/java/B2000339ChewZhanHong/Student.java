package B2000339ChewZhanHong;

public abstract class Student {
//initialize variables of abstract parent class
    protected String name;
    protected String studentId;
    protected String programme;

    //Constructor method
    public Student(String name, String studentId, String programme) {
        this.name = name;
        this.studentId = studentId;
        this.programme = programme;
    }

    //Getter methods
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getProgramme() {
        return programme;
    }

    abstract double calculateSemFee();

    public String toString() {
        return "\nStudent: " + name + " ID: " + studentId + " pursuing "
                + programme + " ";
    }
}

