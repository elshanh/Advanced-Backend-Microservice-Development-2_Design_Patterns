package _2_Structural_Design_Patterns._2_Bridge_Pattern;

import _2_Structural_Design_Patterns._2_Bridge_Pattern.Imp.StudentImp;

public class MainStudent extends Student{
    public MainStudent(StudentImp studentImp) {
        super(studentImp);
    }
    @Override
    public void studentInfoShow() {
        System.out.println("Main Student Info");
        studentImp.studentInfo();
    }
}
