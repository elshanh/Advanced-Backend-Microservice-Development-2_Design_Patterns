package _2_Structural_Design_Patterns._5_Facade_Pattern;

public class Main {
    public static void main(String[] args) {
        StudentInfoFasade studentInfoFasade = new StudentInfoFasade();
        String studentInfo = studentInfoFasade.studentInfoShow(123456);
        System.out.println(studentInfo);
    }
}
