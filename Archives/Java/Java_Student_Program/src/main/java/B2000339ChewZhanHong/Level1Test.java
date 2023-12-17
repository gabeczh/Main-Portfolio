/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2000339ChewZhanHong;

/**
 *
 * @author Chew Zhan Hong B2000339
 */
public class Level1Test {

    public static void main(String[] args) {
        //initialize variables for driver class 
        Course cu1 = new Course("BIT210", "Web Pro");
        Course cu2 = new Course("BIT106", "Java");
        Course cu3 = new Course("BIT110", "Operating System");
        Course cu4 = new Course("BIT208", "Data Structures");
        Course cu5 = new Course("BIT208", "Data Structures");

        Academic ac1 = new Academic("Abdul Wahab", "Prof.");
        Academic ac2 = new Academic("Prof.Xi Ping", "Assoc.");
        Academic ac3 = new Academic("Chick Man", "Prof.");

        Course[] courseList1 = {cu1, cu2, cu3, cu4};
        Course[] courseList2 = {};
        Course[] courseList3 = {cu1, cu2, cu3, cu4, cu5};

        String test = (""); //Blank String
        String test2 = ("RESEARCH"); //Test String
        String test3 = ("A"); //Test String 2

        //Sample Output 1
        //If array has elements
        System.out.println(" Sample Output 1: ");
        UnderGrad ug1 = new UnderGrad("Ali", "1", "BIT", 20);
        System.out.println(ug1);
        ug1.registerCourse(courseList1);

        //Sample Output 2
        //If array is empty
        System.out.println(" Sample Output 2: ");
        UnderGrad ug2 = new UnderGrad("Alice", "2", "BCS", 70);
        System.out.println(ug2);
        ug2.registerCourse(courseList2);

        //Sample Output UnderGrad Error Test
        System.out.println(" Sample Output UnderGrad Error Test: ");
        UnderGrad stuError = new UnderGrad("Bill", "12", "BCS", 70);
        System.out.println(stuError);
        stuError.registerCourse(courseList3);

        //Sample Output 3
        System.out.println(" Sample Output 3 ");
        PostGrad pg1 = new PostGrad("Adil", "8", "Ph.D", "RESEARCH", ac1);
        System.out.println(pg1);

        //Sample Output 4
        System.out.println(" Sample Output 4: ");
        PostGrad pg2 = new PostGrad("Sally", "7", "MIT", "THESIS WRITING", ac2);
        System.out.println(pg2);

        //Sample Output to test SetStatus method
        System.out.println(" Sample Output SetStatus Error Test: ");
        PostGrad pgTest = new PostGrad("Bob", "10", "MIT", test3, ac3);
        System.out.println(pgTest);

        //Error Test
        pgTest.setStatus(test);
        System.out.println(pgTest);

        //Method Test
        pgTest.setStatus(test2);
        System.out.println(pgTest);

    }

}

