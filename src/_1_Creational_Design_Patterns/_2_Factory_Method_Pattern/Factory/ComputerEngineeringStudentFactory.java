package _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Factory;

import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.ComputerEngineeringStudent;
import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Imp.StudentFactoryImp;
import _1_Creational_Design_Patterns._2_Factory_Method_Pattern.Imp.StudentImp;

public class ComputerEngineeringStudentFactory implements StudentFactoryImp {
    @Override
    public StudentImp createStudent() {
        return new ComputerEngineeringStudent();
    }
}
