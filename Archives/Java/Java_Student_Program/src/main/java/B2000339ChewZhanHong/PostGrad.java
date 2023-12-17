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
public class PostGrad {
//initialize variables

    private String name;
    private String studentId;
    private String programme;
    private String status = "AUDIT";
    private Academic supervisor;
    //PostGrad Constructor Method

    PostGrad(String name, String studentId, String programme, String status, Academic supervisor) {
        this.name = name;
        this.studentId = studentId;
        this.programme = programme;
        this.status = status;
        this.supervisor = supervisor;
    }
    //Getter Methods

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getProgramme() {
        return programme;
    }

    public String getStatus() {
        return status;
    }

    public Academic getSupervisor() {
        return supervisor;
    }

    //setStatus method : Functional
    public boolean setStatus(String status) {
        //default value is "AUDIT"
        //can be set to "RESEARCH" and "THESIS WRITING" only
        //initialize variables for setStatus method
        PostGrad.this.status = status;
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
            PostGrad.this.status = ("AUDIT");
            return false;
        }
    }

    public String toString() {
        return (" Student: " + name + " ID: " + studentId + " pursuing "
                + programme + " ( " + status + " ) " + "is under the supervision of " + supervisor);
    }
}
