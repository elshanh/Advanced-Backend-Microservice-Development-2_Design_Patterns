package _2_Structural_Design_Patterns._6_Proxy_Pattern;

import _2_Structural_Design_Patterns._6_Proxy_Pattern.Imp.StudentImp;

public class StudentProxy implements StudentImp {
    private StudentReal studentReal;
    private int studentId;

    public StudentProxy(int studentId) {
        this.studentId = studentId;
    }
    @Override
    public void studentInfoShow() {
        if (studentReal == null) {
            System.out.println("Student Info (Proxy poccess)");
            studentReal = new StudentReal("Student_Name_1", "Student_Surname_1");
        }
        studentReal.studentInfoShow();
    }
}
