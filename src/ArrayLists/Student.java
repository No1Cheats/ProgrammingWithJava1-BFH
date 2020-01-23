package ArrayLists;

import java.util.ArrayList;

public class Student {

    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private String adress;

    public Student(String adress) {
        this.adress = adress;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }
}
