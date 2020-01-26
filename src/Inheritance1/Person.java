package Inheritance1;

public class Person {

    protected String name; //Use protected instead of private

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
