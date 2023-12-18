package _2_Structural_Design_Patterns._2_Bridge_Pattern;

import _2_Structural_Design_Patterns._2_Bridge_Pattern.Imp.StudentImp;

public abstract class Student {
    protected StudentImp studentImp;

    public Student(StudentImp studentImp) {
        this.studentImp = studentImp;
    }

    public abstract void studentInfoShow();
}
