package javafirstsemester.arraylists;

public class EduTester {


    public static void main(String[] args) {
        University Stanford = new University();
        Student Dario = new Student("27 Pullman Street");
        Student Ian = new Student("49 Washington Street");
        Student Becky = new Student("11090 SE Terrace");

        Stanford.addStudent(Dario);
        Stanford.addStudent(Ian);
        Stanford.addStudent(Becky);

        Becky.addGrade(4);
        Ian.addGrade(6);
        Ian.addGrade(5);
        System.out.println(Ian.getGrades());
    }


}
