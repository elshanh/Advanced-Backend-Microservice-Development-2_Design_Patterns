package _3_Behavioral_Design_Patterns._4_Strategy;

import _3_Behavioral_Design_Patterns._4_Strategy.Imp.ExamCalculationStrategyImp;

public class WeightedExamStrategy implements ExamCalculationStrategyImp {
    @Override
    public double examCalculate(double guizExam, double finalExam) {

        return (guizExam * 0.3) + (finalExam * 0.7);
    }
}
