package Interfaces;

public class RestaurantTest {
    public static void main(String[] args) {
        Employee empl = new Employee();
        Student stud = new Student();
        Restaurant rest = new Restaurant();
        rest.receive(empl);
        rest.receive(stud);
    }
}
