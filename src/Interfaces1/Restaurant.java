package Interfaces1;

public class Restaurant {

    public void receive(Customer c){
        System.out.println("Welcome to the restaurant my dude");
        c.eat();
        c.pay();
    }
}
