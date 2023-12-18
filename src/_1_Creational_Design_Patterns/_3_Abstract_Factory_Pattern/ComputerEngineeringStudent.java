package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern.Imp.ComputerEngineeringStudentImp;

public class ComputerEngineeringStudent implements ComputerEngineeringStudentImp {
    @Override
    public void viewComputerEngineeringInfo() {
        System.out.println("Computer Engineering Student");
    }
}
