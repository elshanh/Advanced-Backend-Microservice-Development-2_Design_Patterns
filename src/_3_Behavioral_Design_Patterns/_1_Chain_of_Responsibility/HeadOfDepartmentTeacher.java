package _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility;

import _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility.Imp.AssessmentImp;

public class HeadOfDepartmentTeacher implements AssessmentImp {
    private AssessmentImp nextAssessment;
    public void nextAssessment(AssessmentImp assessmentImp) {
        this.nextAssessment = assessmentImp;
    }

    @Override
    public void assessmentTeacher(Student student) {
        if (student.getExamScore() >= 80) {
            System.out.println("Head of Department Teacher: " + student.getName() +" "+ student.getSurname() + " is successful.");
        } else if (nextAssessment != null) {
            nextAssessment.assessmentTeacher(student);
        }
    }
}
