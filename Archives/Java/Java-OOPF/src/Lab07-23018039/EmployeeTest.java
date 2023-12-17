public class EmployeeTest{

    public static void main(String[] args){

        Employee employee1 = new Employee("Alex", "Tan", 2000);
        Employee employee2 = new Employee("George", "Ma", 3500);

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.increaseSalary(10);
        employee2.increaseSalary(10);

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("Total salary for all employees is " + Employee.total_salary);
    }
}
