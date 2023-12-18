package _3_Behavioral_Design_Patterns._2_Iterator.Imp;

import _3_Behavioral_Design_Patterns._2_Iterator.Student;

public interface StudentCollectionImp extends Iterable<Student>{
    void addStudent(Student student);
}
