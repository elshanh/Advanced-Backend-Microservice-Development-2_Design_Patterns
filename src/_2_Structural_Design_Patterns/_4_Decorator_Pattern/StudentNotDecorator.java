package _2_Structural_Design_Patterns._4_Decorator_Pattern;

import _2_Structural_Design_Patterns._4_Decorator_Pattern.Imp.StudentImp;

public class StudentNotDecorator extends StudentDecorator {
    public StudentNotDecorator(StudentImp studentImp) {
        super(studentImp);
    }

    @Override
    public void studentInfoShow() {
    super.studentInfoShow();
        System.out.println("NOT Decorator");
    }
}
