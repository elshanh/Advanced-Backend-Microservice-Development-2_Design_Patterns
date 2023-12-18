package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Factory;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.ComputerEngineeringStudent;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.FacultyManagementStudent;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.ComputerEngineeringStudentImp;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.FacultyManagementStudentImp;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.StudentFactoryImp;

public class ComputerEngineeringStudentFactory implements StudentFactoryImp {
    @Override
    public ComputerEngineeringStudentImp computerEngineeringStudent() {
        return new ComputerEngineeringStudent();
    }

    @Override
    public FacultyManagementStudentImp facultyManagementStudent() {
        return new FacultyManagementStudent();
    }
}
