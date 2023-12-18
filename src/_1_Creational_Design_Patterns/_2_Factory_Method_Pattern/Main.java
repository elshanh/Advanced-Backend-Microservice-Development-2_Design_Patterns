package _1_Creational_Design_Patterns._2_Factory_Method_Pattern;

import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Factory.ComputerEngineeringStudentFactory;
import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Factory.FacultyManagementStudentFactory;
import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Imp.StudentFactoryImp;
import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Imp.StudentImp;

public class Main {
    public static void main(String[] args) {
        StudentFactoryImp computerEngineeringStudentFactory = new ComputerEngineeringStudentFactory();
        StudentImp computerEngineeringStudent = computerEngineeringStudentFactory.createStudent();
        computerEngineeringStudent.viewInfo();

        StudentFactoryImp facultyManagementStudentFactory = new FacultyManagementStudentFactory();
        StudentImp facultyManagementStudent = facultyManagementStudentFactory.createStudent();
        facultyManagementStudent.viewInfo();
    }
}
