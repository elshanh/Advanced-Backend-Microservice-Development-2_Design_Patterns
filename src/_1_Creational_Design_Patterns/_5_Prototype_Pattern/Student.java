package _1_Creational_Design_Patterns._5_Prototype_Pattern;

public class Student implements Cloneable{
    private int studentId;
    private String name;
    private String surname;
    private String faculity;

    public Student(int studentId,String name,String surname,String faculity) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.faculity = faculity;
    }

    /*implements Cloneable @Override*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
}
