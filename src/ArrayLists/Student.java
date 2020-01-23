package ArrayLists;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {

    private ArrayList<Double> grades = new ArrayList<>();

    public Student() {
    }

    public void addGrade(double grade){
        grades.add(grade);
    }

    public ArrayList<Double> getGrades(){
        return grades;
    }

    public String getAvgGrade(){
        double avg = 0;
        double sum = 0;
        for(Double grade : grades){
            avg += grade.doubleValue();
            sum++;
        }
        return new DecimalFormat("##.##").format(avg/sum);
    }
}
