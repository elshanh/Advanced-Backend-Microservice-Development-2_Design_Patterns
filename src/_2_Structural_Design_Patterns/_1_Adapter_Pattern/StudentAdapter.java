package _2_Structural_Design_Patterns._1_Adapter_Pattern;

import _2_Structural_Design_Patterns._1_Adapter_Pattern.Imp.StudentImp;

public class StudentAdapter implements StudentImp {
    private StudentOld studentOld;

    public StudentAdapter(StudentOld studentOld) {
        this.studentOld = studentOld;
    }
    @Override
    public String getName() {
        return studentOld.getName();
    }
    @Override
    public String getSurname() {
        return studentOld.getSurname();
    }
}