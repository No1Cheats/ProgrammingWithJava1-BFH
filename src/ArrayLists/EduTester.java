package ArrayLists;

public class EduTester {


    public static void main(String[] args) {
        University Stanford = new University();
        Student Dario = new Student();
        Student Ian = new Student();
        Student Becky = new Student();

        Stanford.addStudent(Dario);
        Stanford.addStudent(Ian);
        Stanford.addStudent(Becky);

        Becky.addGrade(4);
        Ian.addGrade(6);
        Ian.addGrade(5);
        Ian.addGrade(3.7);
        Ian.addGrade(5.5);
        System.out.println(Ian.getAvgGrade());
    }


}
