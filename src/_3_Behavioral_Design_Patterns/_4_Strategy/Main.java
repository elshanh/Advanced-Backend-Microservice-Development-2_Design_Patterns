package _3_Behavioral_Design_Patterns._4_Strategy;

import _3_Behavioral_Design_Patterns._4_Strategy.Imp.ExamCalculationStrategyImp;

public class Main {
    public static void main(String[] args) {
        ExamCalculate examCalculator = new ExamCalculate();

        ExamCalculationStrategyImp averageExamStrategy = new AverageExamStrategy();
        examCalculator.setExamCalculationStrategy(averageExamStrategy);

        double averageExam = examCalculator.calculate(80, 90);
        System.out.println("Average Score: " + averageExam);

        ExamCalculationStrategyImp weightedExamStrategy = new WeightedExamStrategy();
        examCalculator.setExamCalculationStrategy(weightedExamStrategy);

        double weightedExam = examCalculator.calculate(80, 90);
        System.out.println("Weighted Score: " + weightedExam);
    }
}
