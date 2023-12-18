package _3_Behavioral_Design_Patterns._4_Strategy;

import _3_Behavioral_Design_Patterns._4_Strategy.Imp.ExamCalculationStrategyImp;

public class ExamCalculate {
    private ExamCalculationStrategyImp strategy;

    public void setExamCalculationStrategy(ExamCalculationStrategyImp examCalculationStrategyImp){
        this.strategy = examCalculationStrategyImp;
    }
    public double calculate(double guizExam, double finalExam){
        if (strategy == null) {
            throw new IllegalStateException("Exam calculation strategy is not set !");
        }
        return strategy.examCalculate(guizExam, finalExam);
    }
}
