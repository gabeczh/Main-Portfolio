public class Employee{

    private String firstName;
    private String lastName;
    private double monthlySalary;
    public static double total_salary;

    public Employee(){
    
        firstName = "";
        lastName = "";
        setMonthlySalary(0);
    }

    public Employee(String fn, String ln, double salary){
       
        setFirstName(fn);
        setLastName(ln);
        setMonthlySalary(salary);
    
    }

    public void setFirstName(String fn){
    
        firstName = fn;
    }

    public String getFirstName(){
    
        return firstName;
    }

    public void setLastName(String ln){
    
        lastName = ln;
    }

    public String getLastName(){
    
        return lastName;
    }

    public void setMonthlySalary(double salary){

        total_salary = total_salary - (monthlySalary * 12);
        if(salary > 0){
        
           monthlySalary = salary;
        }
        total_salary = total_salary + (monthlySalary * 12);
    }

    public double getMonthlySalary(){
    
        return monthlySalary;
    }

    public void increaseSalary(double p){
    
        setMonthlySalary(getMonthlySalary() * (1 + p/100));
    }

    public String toString(){
    
        return String.format("First Name: %s\n Last Name: %s\n Yearly Salary: %.2f\n",
                getFirstName(), getLastName(), getMonthlySalary() * 12);
    }




}
