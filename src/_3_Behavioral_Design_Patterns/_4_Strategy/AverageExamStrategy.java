package _3_Behavioral_Design_Patterns._4_Strategy;

import _3_Behavioral_Design_Patterns._4_Strategy.Imp.ExamCalculationStrategyImp;

public class AverageExamStrategy implements ExamCalculationStrategyImp {
    @Override
    public double examCalculate(double guizExam, double finalExam) {
        return (guizExam + finalExam) / 2;
    }
}
