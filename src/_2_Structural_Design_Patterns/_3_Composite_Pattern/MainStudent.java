package _2_Structural_Design_Patterns._3_Composite_Pattern;

import _2_Structural_Design_Patterns._3_Composite_Pattern.Imp.StudentImp;

public class MainStudent implements StudentImp {
    private String name;
    private String surname;

    public MainStudent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public void studentInfoShow() {
        System.out.println("NAME: "     + name);
        System.out.println("SURNAME: "  + surname);
    }
}
