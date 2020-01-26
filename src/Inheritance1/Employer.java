package Inheritance1;

public class Employer extends Person{ //extends to use Class person

    private int numOfEmployees; //Private because no other class needs to use this :)

    public Employer(String name, int numOfEmployees){
        super(name); //To use the built in name method/constructor from our Person class which we are extending here
        this.numOfEmployees = numOfEmployees;
    }

    public int getNumOfEmployees(){
        return numOfEmployees;
    }

}
