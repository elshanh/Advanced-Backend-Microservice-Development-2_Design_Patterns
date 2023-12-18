package _3_Behavioral_Design_Patterns._3_Observer;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("STUDENT_NAME_1","STUDENT_SURNAME_1");
        Student student2 = new Student("STUDENT_NAME_2","STUDENT_SURNAME_2");

        LevelManager levelManager = new LevelManager();

        levelManager.addObserver(student1);
        levelManager.addObserver(student2);

        levelManager.setLevel(90);
    }
}
