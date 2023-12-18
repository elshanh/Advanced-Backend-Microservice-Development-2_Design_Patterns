package _1_Creational_Design_Patterns._4_Builder_Pattern;

public class Student {
    private int studentId;
    private String name;
    private String surname;
    private String faculity;

    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.faculity = builder.faculity;
    }

    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getFaculity() {
        return faculity;
    }

    /*Builder class*/
    static class Builder {
        private int studentId;
        private String name;
        private String surname;
        private String faculity;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public Builder studentId(int studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder faculity(String faculity) {
            this.faculity = faculity;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }
}