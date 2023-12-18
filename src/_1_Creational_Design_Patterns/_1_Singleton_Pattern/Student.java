package _1_Creational_Design_Patterns._1_Singleton_Pattern;

public class Student {
    private static Student instance;

    private int studentId;
    private String name;
    private String surname;

    private Student(int studentId,String name,String surname) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
    }
    public static Student getInstance(int studentId,String name,String surname) {
        if (instance == null)
            instance = new Student(studentId,name,surname);
        return instance;
    }
    public void viewStudentInfo() {
        System.out.println("Student ID: "   + studentId);
        System.out.println("Name: "         + name);
        System.out.println("Surname: "      + surname);
    }
}

