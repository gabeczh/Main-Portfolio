/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2000339ChewZhanHong;

/**
 *
 * @author Chew Zhan Hong B2000339
 */
//PostGrad class Method
public class PostGrad2 extends Student {
//initialize variables

    private String status = "AUDIT";
    private Academic supervisor;

    //PostGrad Constructor Method
    PostGrad2(String name, String studentId, String programme, String status, Academic supervisor) {
        super(name, studentId, programme);
        this.status = status;
        this.supervisor = supervisor;
    }

    //Getter Methods
    public String getStatus() {
        return status;
    }

    public Academic getSupervisor() {
        return supervisor;
    }

//Calculate Semester Fees Methods : Override 
    public double calculateSemFee() {
        //initialize variables
        double mastersFee = 6000;
        double phDFee = 8000;
        //if the string in programme starts with "M", it will print out the masters programme fee
        if (programme.startsWith("M")) {
            System.out.println("and has semester fee: " + mastersFee + "RM ");
            //else if the string in programme starts with "P", it will print out the PhD programme fee
        } else if (programme.startsWith("P")) {
            System.out.println("and has semester fee: " + phDFee + "RM ");
        }
        //method will return 0 as default value
        return 0;
    }

    //setStatus method : Functional
    public boolean setStatus(String status) {
        //default value is "AUDIT"
        //can be set to "RESEARCH" and "THESIS WRITING" only
        //initialize variables for setStatus method
        PostGrad2.this.status = status;
        final String status1 = "RESEARCH";
        final String status2 = "THESIS WRITING";

        if (status.equals(status1)) { //if value equals to "RESEARCH", print status has been changed and display new status.
            System.out.println(" Status has been changed ");
            return true;
        } else if (status.equals(status2)) { //if value equals to "THESIS WRITING", print status has been changed and display new status.
            System.out.println(" Status has been changed ");
            return true;

        } else { //if value is not set to either "RESEARCH" or "THESIS WRITING", value will be set to default value.
            System.out.println(" Status can only be set to RESEARCH, or THESIS WRITING only! ");
            PostGrad2.this.status = ("AUDIT");
            return false;
        }
    }

    //To String Method
    public String toString() {
        return (super.toString() + " ( " + status + " ) " + "is under the supervision of " + supervisor);
    }
}
