package _3_Behavioral_Design_Patterns._2_Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("STUDENT_NAME_1","STUDENT_SURNAME_1"));
        studentList.addStudent(new Student("STUDENT_NAME_2","STUDENT_SURNAME_2"));
        studentList.addStudent(new Student("STUDENT_NAME_3","STUDENT_SURNAME_3"));

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Student : " + student.getName() + ". " + student.getSurname());
        }
    }
}
