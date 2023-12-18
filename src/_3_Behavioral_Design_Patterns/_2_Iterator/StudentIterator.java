package _3_Behavioral_Design_Patterns._2_Iterator;

import _3_Behavioral_Design_Patterns._2_Iterator.Imp.StudentIteratorImp;

import java.util.Iterator;

public class StudentIterator implements StudentIteratorImp {
    private StudentList studentList;
    private int index;

    public StudentIterator(StudentList studentList) {
        this.studentList = studentList;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < studentList.getStudents().size();
    }

    public Student next() {
        if (hasNext()) {
            return studentList.getStudents().get(index++);
        }
        return null;
    }
}
