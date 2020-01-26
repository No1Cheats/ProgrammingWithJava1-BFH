package Interfaces;

public class Student implements Customer{

    @Override //Pretty mcuh auto generated from IntelliJ, just added the sout
    public void eat() {
        System.out.println("Student is eating, nom nom nom");
    }

    @Override
    public void pay() {
        System.out.println("Student is paying $$$$");
    }
}
