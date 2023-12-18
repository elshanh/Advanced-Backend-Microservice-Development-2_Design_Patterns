package _2_Structural_Design_Patterns._1_Adapter_Pattern;

import _2_Structural_Design_Patterns._1_Adapter_Pattern.Imp.StudentImp;

public class Main {
    public static void main(String[] args) {
        StudentOld studentOld = new StudentOld("Student_Old_Name", "Student_Old_Surname");

        StudentImp newStudent = new StudentAdapter(studentOld);

        System.out.println("NAME: "     + newStudent.getName());
        System.out.println("SURNAME: "  + newStudent.getSurname());
    }
}
