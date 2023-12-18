 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2000339ChewZhanHong;

/**
 *
 * @author Chew Zhan Hong B2000339
 */
public class UnderGrad {
//initialize variables for UnderGrad class 
    private String name;
    private String studentId;
    private String programme;
    private Course[] courseList = new Course[4];
    private int creditsCompleted;

    //UnderGrad constructor method
    UnderGrad(String name, String studentId, String programme, int creditsCompleted) {
        //initialize variables for UnderGrad constructor method
        this.name = name;
        this.studentId = studentId;
        this.programme = programme;
        this.creditsCompleted = creditsCompleted;

    }
    //getter methods
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getProgramme() {
        return programme;
    }

    public int getCreditsCompleted() {
        return creditsCompleted;
    }

    public boolean registerCourse(Course[] courseList) {
        //MAX of 4 courses can be registered
        //return false value if beyond MAX size
        //initialize null or empty array element
        Course[] courseListNull = {};
        //if the array size is equal to 4, print a message and 4 elements in the array
        if (courseList.length <= 4) {
            System.out.println(" The student has registered for the following "
                    + courseList.length + " courses this semester ");
            for (int i = 0; i < courseList.length; i++) {
                System.out.println(courseList[i]);
            }
        //if the array size is greater or equal to 5, print a message and return false
        } else if (courseList.length >= 5) {
            System.out.println(" Max amount of courses has been reached! ");
            return false;
        //if the array size is equal to null, print a message.
        } else if (courseList.length == courseListNull.length) {
            System.out.println(" The student has not registered for any courses. ");
        }
        //The method will return true as default value
        return true;
    }

    public String toString() {
        return (" Student: " + name + " ID: " + studentId + " pursuing " + programme
                + " has completed " + creditsCompleted + " credits ");
    }

}
