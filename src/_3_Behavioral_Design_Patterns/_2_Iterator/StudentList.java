package _3_Behavioral_Design_Patterns._2_Iterator;

import _3_Behavioral_Design_Patterns._2_Iterator.Imp.StudentCollectionImp;
import _3_Behavioral_Design_Patterns._2_Iterator.Imp.StudentIteratorImp;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentList implements StudentCollectionImp {
    private List<Student> students = new ArrayList<>();

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
