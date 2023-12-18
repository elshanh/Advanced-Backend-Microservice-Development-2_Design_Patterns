package _2_Structural_Design_Patterns._3_Composite_Pattern;

import _2_Structural_Design_Patterns._3_Composite_Pattern.Imp.StudentImp;
import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements StudentImp {
    private List<StudentImp> studentImpList = new ArrayList<>();

    public void addStudent(StudentImp studentImp) {
        studentImpList.add(studentImp);
    }
    @Override
    public void studentInfoShow() {
        System.out.println("Student Group Info:");
        for (StudentImp studentImp : studentImpList) {
            studentImp.studentInfoShow();
            System.out.println("---------------");
        }
    }
}
