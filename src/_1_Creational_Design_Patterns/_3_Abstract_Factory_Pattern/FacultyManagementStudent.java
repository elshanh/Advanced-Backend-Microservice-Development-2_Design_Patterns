package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.FacultyManagementStudentImp;

public class FacultyManagementStudent implements FacultyManagementStudentImp {
    @Override
    public void viewFacultyManagementInfo() {
        System.out.println("Faculty of Management Student");
    }
}
