package _2_Structural_Design_Patterns._2_Bridge_Pattern;

import _2_Structural_Design_Patterns._2_Bridge_Pattern.Imp.StudentImp;

public class Main {
    public static void main(String[] args) {
        StudentImp studentImp = new MainStudentImp("Student_Name_1", "Student_Surname_1");
        Student student = new MainStudent(studentImp);
        student.studentInfoShow();
    }
}
