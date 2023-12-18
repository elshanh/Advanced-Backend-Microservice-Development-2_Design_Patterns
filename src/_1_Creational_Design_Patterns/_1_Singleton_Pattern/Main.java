package _1_Creational_Design_Patterns._1_Singleton_Pattern;

public class Main {
    public static void main(String[] args) {

        Student student1 = Student.getInstance(11111, "Student_Name_1","Student_Surname_1");
        Student student2 = Student.getInstance(22222, "Student_Name_2","Student_Surname_2");

        student1.viewStudentInfo();
        student2.viewStudentInfo();
    }
}