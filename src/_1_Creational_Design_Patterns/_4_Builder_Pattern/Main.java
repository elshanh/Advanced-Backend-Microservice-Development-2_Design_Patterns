package _1_Creational_Design_Patterns._4_Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student.Builder("Student_Name_1", "Student_Surname_1").studentId(123456).faculity("Computer Engineering").build();

        System.out.println("ID: " +         student1.getStudentId());
        System.out.println("NAME: " +       student1.getName());
        System.out.println("SURNAME: " +    student1.getSurname());
        System.out.println("FACULITY: " +   student1.getFaculity());

        System.out.println("**************************************************************");

        Student student2 = new Student.Builder("Student_Name_2", "Student_Surname_2").build();
        System.out.println("NAME: " +       student2.getName());
        System.out.println("SURNAME: " +    student2.getSurname());
    }
}
