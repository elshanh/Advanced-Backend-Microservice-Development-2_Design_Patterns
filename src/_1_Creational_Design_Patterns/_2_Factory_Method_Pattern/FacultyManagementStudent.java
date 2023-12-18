package _1_Creational_Design_Patterns._2_Factory_Method_Pattern;

import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Imp.StudentImp;

public class FacultyManagementStudent implements StudentImp {
    @Override
    public void viewInfo() {
        System.out.printf("Faculty of Management Student");
    }
}
