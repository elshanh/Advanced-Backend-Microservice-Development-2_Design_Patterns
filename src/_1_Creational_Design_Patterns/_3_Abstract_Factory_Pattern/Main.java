package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Factory.ComputerEngineeringStudentFactory;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Factory.FacultyManagementStudentFactory;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.ComputerEngineeringStudentImp;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.FacultyManagementStudentImp;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.StudentFactoryImp;

public class Main {
    public static void main(String[] args) {
        /*ComputerEngineeringStudentFactory ile bir Student obyekti yaradilir*/
        StudentFactoryImp computerEngineeringStudentFactory = new ComputerEngineeringStudentFactory();
        ComputerEngineeringStudentImp computerEngineeringStudent = computerEngineeringStudentFactory.computerEngineeringStudent();
        FacultyManagementStudentImp facultyManagementStudent = computerEngineeringStudentFactory.facultyManagementStudent();

        computerEngineeringStudent.viewComputerEngineeringInfo(); /*PRINT -> Computer Engineering Student*/
        facultyManagementStudent.viewFacultyManagementInfo();     /*PRINT -> FacultyManagementStudent*/

        /*FacultyManagementStudentFactory ile bir Student obyekti yaradilir*/
        StudentFactoryImp facultyManagementStudentFactory = new FacultyManagementStudentFactory();
        ComputerEngineeringStudentImp economyStudent = facultyManagementStudentFactory.computerEngineeringStudent();
        FacultyManagementStudentImp historyStudent = facultyManagementStudentFactory.facultyManagementStudent();

        economyStudent.viewComputerEngineeringInfo(); /*PRINT -> Economy Student*/
        historyStudent.viewFacultyManagementInfo();   /*PRINT -> History Student*/
    }
}
