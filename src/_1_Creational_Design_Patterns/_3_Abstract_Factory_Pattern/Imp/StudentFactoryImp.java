package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp;

public interface StudentFactoryImp {
    ComputerEngineeringStudentImp computerEngineeringStudent();
    FacultyManagementStudentImp facultyManagementStudent();
}
