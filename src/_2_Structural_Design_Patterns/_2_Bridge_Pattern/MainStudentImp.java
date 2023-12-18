package _2_Structural_Design_Patterns._2_Bridge_Pattern;

import _2_Structural_Design_Patterns._2_Bridge_Pattern.Imp.StudentImp;

public class MainStudentImp implements StudentImp {
    private String name;
    private String surname;

    public MainStudentImp(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public void studentInfo() {
        System.out.println("Ad: "       + name);
        System.out.println("Soyad: "    + surname);
    }
}
