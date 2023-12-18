package _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility;

import _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility.Imp.AssessmentImp;

public class Main {
    public static void main(String[] args) {
        AssessmentImp classTeacher = new ClassTeacher();
        AssessmentImp headOfDepartmentTeacher = new HeadOfDepartmentTeacher();
        AssessmentImp dean = new DeanTeacher();

        ((ClassTeacher) classTeacher).nextAssessment(headOfDepartmentTeacher);
        ((HeadOfDepartmentTeacher) headOfDepartmentTeacher).nextAssessment(dean);

        Student student1 = new Student("STUDENT_NAME_1","STUDENT_SURNAME_1", 75);
        Student student2 = new Student("STUDENT_NAME_2","STUDENT_SURNAME_2", 95);

        classTeacher.assessmentTeacher(student1);
        System.out.println("-------------");
        classTeacher.assessmentTeacher(student2);
    }
}
