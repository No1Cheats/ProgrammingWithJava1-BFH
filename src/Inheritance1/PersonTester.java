package Inheritance1;

public class PersonTester {

    public static void main(String[] args) {
        //Company
        Employer Amazon = new Employer("Amazon", 647500);

        //Employee
        Employee Bob = new Employee("Bob", 3);

        //"Tests"
        System.out.println(Amazon.getName());
        System.out.println(Amazon.getNumOfEmployees());

        System.out.println(Bob.getName());
        System.out.println(Bob.getYearsOfExperience());
    }
}
