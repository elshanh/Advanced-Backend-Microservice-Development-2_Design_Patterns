package _2_Structural_Design_Patterns._1_Adapter_Pattern;

public class StudentOld {
    private String name;
    private String surname;

    public StudentOld(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}
