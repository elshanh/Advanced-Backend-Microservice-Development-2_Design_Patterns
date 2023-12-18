package _2_Structural_Design_Patterns._3_Composite_Pattern;

public class Main {
    public static void main(String[] args) {
        MainStudent mainStudent1 = new MainStudent("Student_Name_1", "Student_Surname_1");
        MainStudent mainStudent2 = new MainStudent("Student_Name_2", "Student_Surname_2");

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(mainStudent1);
        studentGroup.addStudent(mainStudent2);

        studentGroup.studentInfoShow();
    }
}
