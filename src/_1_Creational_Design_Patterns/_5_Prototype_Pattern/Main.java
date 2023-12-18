package _1_Creational_Design_Patterns._5_Prototype_Pattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(123456,"Student_Name_1", "Student_Surname_1", "Computer Engineering");

        try {
            /*Prototype (Copy)*/
            Student prototypeStudent = (Student) student.clone();

            System.out.println("ID: " +         prototypeStudent.getStudentId());
            System.out.println("NAME: " +       prototypeStudent.getName());
            System.out.println("SURNAME: " +    prototypeStudent.getSurname());
            System.out.println("FACULITY: " +   prototypeStudent.getFaculity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
