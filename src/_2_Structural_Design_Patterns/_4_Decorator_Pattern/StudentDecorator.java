package _2_Structural_Design_Patterns._4_Decorator_Pattern;

import _2_Structural_Design_Patterns._4_Decorator_Pattern.Imp.StudentImp;

public abstract class StudentDecorator implements StudentImp {
    protected StudentImp studentImp;

    public StudentDecorator(StudentImp studentImp) {
        this.studentImp = studentImp;
    }

    @Override
    public void studentInfoShow() {
        studentImp.studentInfoShow();
    }
}
