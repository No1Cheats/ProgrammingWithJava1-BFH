package ArrayLists;

import java.util.ArrayList;

public class University {

    private ArrayList<Student> students = new ArrayList<Student>();

    public University() {
        //Empty
    }

    public void addStudent(Student student){
        students.add(student);
    }
}


