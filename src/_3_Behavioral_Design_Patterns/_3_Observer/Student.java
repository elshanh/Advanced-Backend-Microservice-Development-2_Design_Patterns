package _3_Behavioral_Design_Patterns._3_Observer;

import _3_Behavioral_Design_Patterns._3_Observer.Imp.LevelObserverImp;

public class Student implements LevelObserverImp {
    private String name;
    private String surname;

    public Student(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void update(int newLevel) {
        System.out.println(name + ". " + surname + " score has been updated: " + newLevel);
    }
}
