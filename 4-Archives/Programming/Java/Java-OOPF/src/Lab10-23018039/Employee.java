public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(){
    
        firstName = "";
        lastName = "";
        birthDate = null;
        hireDate = null;
    }

    public Employee(String fn, String ln, int bd, int bm, int by, int hd, int hm, int hy){
    
        firstName = fn;
        lastName = ln;
        birthDate = new Date(bd,bm,by);
        hireDate = new Date(hd,hm,hy);
    }

    public String getFirstName(){
    
        return firstName;
    }

    public void setFirstName(String fn){
    
        firstName = fn;
    }

    public String getLastName(){
    
        return lastName;
    }

    public void setLastName(String ln){
    
        lastName = ln;
    }

    public Date getBirthDate(){
    
        return birthDate;
    }

    public Date getHireDate(){
    
        return hireDate;
    }

    public String toString(){
    
        return String.format("Employee with first name %s last name %s has birthday on %s and was hired on %s. ",
                getFirstName(), getLastName(), getBirthDate(), getHireDate());
    }
}
