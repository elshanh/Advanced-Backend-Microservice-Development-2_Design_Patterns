package _2_Structural_Design_Patterns._5_Facade_Pattern;

public class StudentInfoFasade {
    private StudentInfo studentInfo;
    private StudentScoreInfo studentScoreInfo;
    private StudentAbsenteeism studentAbsenteeism;

    public StudentInfoFasade() {
        this.studentInfo = new StudentInfo();
        this.studentScoreInfo = new StudentScoreInfo();
        this.studentAbsenteeism = new StudentAbsenteeism();
    }

    public String studentInfoShow(int studentId) {
        String studentInfo1 = studentInfo.studentInfoShow(studentId);
        String studentScoreInfo1 = studentScoreInfo.studentScoreInfoShow(studentId);
        String studentAbsenteeism1 = studentAbsenteeism.studentAbsenteeismInfoShow(studentId);
        return studentInfo1 + "\n" + studentScoreInfo1 + "\n" + studentAbsenteeism1;
    }
}
