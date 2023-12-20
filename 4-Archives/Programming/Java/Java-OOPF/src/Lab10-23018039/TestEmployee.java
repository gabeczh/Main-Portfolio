public class TestEmployee {

    public static void main(String[] args){

        Employee emp = new Employee("George","Tan",17,8,1990,25,6,2014);

        System.out.println(emp);

        emp.setLastName("Chan");

        System.out.println(emp);

        emp.getHireDate().setYear(2015);

        System.out.println(emp);
    }
}
