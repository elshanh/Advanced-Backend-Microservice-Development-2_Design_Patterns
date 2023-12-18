package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Factory;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.EconomyStudent;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.HistoryStudent;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.ComputerEngineeringStudentImp;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.FacultyManagementStudentImp;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.StudentFactoryImp;

public class FacultyManagementStudentFactory implements StudentFactoryImp {
    @Override
    public ComputerEngineeringStudentImp computerEngineeringStudent() {
        return new EconomyStudent();
    }

    @Override
    public FacultyManagementStudentImp facultyManagementStudent() {
        return new HistoryStudent();
    }
}
