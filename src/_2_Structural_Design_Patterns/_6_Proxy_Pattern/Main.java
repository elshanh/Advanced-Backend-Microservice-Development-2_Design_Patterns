package _2_Structural_Design_Patterns._6_Proxy_Pattern;

import _2_Structural_Design_Patterns._6_Proxy_Pattern.Imp.StudentImp;

public class Main {
    public static void main(String[] args) {
        StudentImp studentImp = new StudentProxy(123456);
        studentImp.studentInfoShow();
    }
}
