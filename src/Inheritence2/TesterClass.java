package Inheritence2;

public class TesterClass {
    public static void main(String[] args) {

        PizzeriaItaliana pizzeria = new PizzeriaItaliana("PizzeeeeeeeriaItaliana");
        SushiRestaurant sushi = new SushiRestaurant("SushiPalace");

        pizzeria.setNumberOfEmployees(10);
        sushi.setNumberOfEmployees(5);

        System.out.println(pizzeria.toString());
        System.out.println(sushi.toString());

        pizzeria.receivePayment("CASH", 100.0);
        pizzeria.giveRest(10.0);
        pizzeria.receivePayment("CARD", 80.0);

        sushi.receivePayment("CASH", 60.0);
        sushi.giveRest(0.3);
    }


}


