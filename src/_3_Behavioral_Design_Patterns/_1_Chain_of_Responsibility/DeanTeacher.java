package _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility;

import _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility.Imp.AssessmentImp;

public class DeanTeacher implements AssessmentImp {
    @Override
    public void assessmentTeacher(Student student) {
        if (student.getExamScore() >= 90) {
            System.out.println("Dean : " + student.getName() +" "+ student.getSurname() + " is successful.");
        } else {
            System.out.println("Dean : " + student.getName() +" "+ student.getSurname() + " failed.");
        }
    }
}
