package _2_Structural_Design_Patterns._6_Proxy_Pattern;

import _2_Structural_Design_Patterns._6_Proxy_Pattern.Imp.StudentImp;

public class StudentReal implements StudentImp {
    private String name;
    private String surname;

    public StudentReal(String name, String surname) {
        this.name = name;
        this.surname = surname;
        databaseOperation();
    }
    private void databaseOperation() {

        System.out.println("Student Info Show (DB Proccess)");
        try {
            Thread.sleep(2000); /*Uzun muddetli DB proccess-i*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void studentInfoShow() {
        System.out.println("Student Info:");
        System.out.println("NAME: " + name);
        System.out.println("SURNAME: " + surname);
    }
}
