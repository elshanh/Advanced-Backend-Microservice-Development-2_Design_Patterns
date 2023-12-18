package _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility;

public class Student {
    private String name;
    private String surname;

    private double examScore;

    Student(String name, String surname, double examScore) {
        this.name = name;
        this.surname = surname;
        this.examScore = examScore;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getExamScore() {
        return examScore;
    }
    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }
}
