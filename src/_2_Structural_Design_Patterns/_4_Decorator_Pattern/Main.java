package _2_Structural_Design_Patterns._4_Decorator_Pattern;

import _2_Structural_Design_Patterns._4_Decorator_Pattern.Imp.StudentImp;

public class Main {
    public static void main(String[] args) {
        StudentImp studentImp = new MainStudent("Student_Name_1", "Student_Surname_1");
        StudentImp studentNotImp = new StudentNotDecorator(studentImp);
        studentNotImp.studentInfoShow();
    }
}
