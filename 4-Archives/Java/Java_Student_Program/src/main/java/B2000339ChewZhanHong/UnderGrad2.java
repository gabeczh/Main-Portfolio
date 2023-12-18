/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2000339ChewZhanHong;

/**
 *
 * @author Chew Zhan Hong B2000339
 */
public class UnderGrad2 extends Student {
//initialize variables for child class

    private int MAXSIZE = 4;
    private Course[] courseList = new Course[MAXSIZE];
    private int creditsCompleted;
    private int noOfCoursesRegistered = 0;

    //Constructor method
    UnderGrad2(String name, String studentId, String programme, int creditsCompleted) {
        super(name, studentId, programme);

        this.creditsCompleted = creditsCompleted;

    }

    //getter methods
    public int getCreditsCompleted() {
        return creditsCompleted;
    }

    public int getNoOfCoursesRegistered() {
        return noOfCoursesRegistered;
    }

    public boolean registerCourse(Course[] courseList) {
        //MAX of 4 courses can be registered
        //return false value if beyond MAX size
        //if the array size is equal to 4, print a message and the elements in the array
        if (courseList.length == 4) {
            System.out.println(" The student has registered for the following "
                    + courseList.length + " courses this semester ");
            for (int i = 0; i < courseList.length; i++) {
                System.out.println(courseList[i]);
            }
            System.out.println(" and has semester tuition fee: " + calculateSemFee() + "RM ");
            //if the array size is greater or equal to 5, print a message and return false
        } else if (courseList.length >= 5) {
            System.out.println(" Max amount of courses has been reached! ");
            return false;
            //if the array size is equal to 0, print a message.
        } else if (courseList.length == noOfCoursesRegistered) {
            System.out.println(" The student has not registered for any courses. ");
            System.out.println(" and has semester tuition fee: 0.0RM ");
        }
        //The method will return true as default value
        return true;
    }

    public double calculateSemFee() {
        //fee equals to number of courses * credit per hour * fee per credit hour
        noOfCoursesRegistered = courseList.length;
        double Dfee = noOfCoursesRegistered * 4 * 500;
        double fee = Dfee;
        return fee;
    }

    public String toString() {
        return (super.toString() + " has completed " + creditsCompleted + " credits ");
    }

}
