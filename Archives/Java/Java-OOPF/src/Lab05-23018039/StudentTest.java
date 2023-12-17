import java.util.*;

public class StudentTest {

    public static void main(String[] args){
    
        ArrayList<Student> students  = new ArrayList<Student>();
        Student student1 = new Student("Alex",5,"BCS");
        Student student2 = new Student();

        System.out.println(student1);
        System.out.println(student2);

        students.add(student1);
        students.add(student2);

        for(Student s: students){
        
            System.out.print(s);
            System.out.print(s.checkEligibility()? " is eligible": " is not eligible");
            System.out.print(" to get credit exemption\n");
        }


    }
}
