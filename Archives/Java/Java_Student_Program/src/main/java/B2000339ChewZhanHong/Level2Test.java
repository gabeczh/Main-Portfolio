/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2000339ChewZhanHong;

/**
 *
 * @author Chew Zhan Hong B2000339
 */
public class Level2Test {

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
        Course[] courseListTest = {cu1};

        String test = (""); //Blank String
        String test2 = ("RESEARCH"); //Test String
        String test3 = ("A"); //Test String 2

        //Sample Output 1
        //If array has elements
        System.out.println(" Sample Output 1: ");
        UnderGrad2 ug1 = new UnderGrad2("Ali", "1", "BIT", 20);
        System.out.println(ug1);
        ug1.registerCourse(courseList1);
        ug1.calculateSemFee();

        //Sample Output 2
        //If array is empty
        System.out.println(" Sample Output 2: ");
        UnderGrad2 ug2 = new UnderGrad2("Alice", "2", "BCS", 70);
        System.out.println(ug2);
        ug2.registerCourse(courseList2);
        ug2.calculateSemFee();

        //Sample Output UnderGrad Error Test
        System.out.println(" Sample Output UnderGrad Error Test: ");
        UnderGrad2 stuError = new UnderGrad2("Bill", "12", "BCS", 70);
        System.out.println(stuError);
        stuError.registerCourse(courseList3);
        stuError.calculateSemFee();

        //Sample Output 3
        System.out.println(" Sample Output 3: ");
        PostGrad2 pg1 = new PostGrad2("Adil", "8", "Ph.D", "RESEARCH", ac1);
        System.out.println(pg1);
        pg1.calculateSemFee();

        //Sample Output 4
        System.out.println(" Sample Output 4: ");
        PostGrad2 pg2 = new PostGrad2("Sally", "7", "MIT", "THESIS WRITING", ac2);
        System.out.println(pg2);
        pg2.calculateSemFee();

        //Sample Output to test SetStatus method
        System.out.println(" Sample Output SetStatus Error Test: ");
        PostGrad2 pgTest = new PostGrad2("Bob", "10", "Test", test3, ac3);
        System.out.println(pgTest);

        //Error Test
        pgTest.setStatus(test);
        System.out.println(pgTest);

        //Method Test
        pgTest.setStatus(test2);
        System.out.println(pgTest);

    }
}
