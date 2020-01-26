package Inheritence2;


public class SushiRestaurant extends Restaurant implements PayableInCash {

    private double cashMoney=0.0;

    public SushiRestaurant(String name) {
        this.name = name;
    }

    @Override
    public void setNumberOfEmployees(int number) {
        this.numberOfEmployees = number;

    }

    @Override
    public String toString() {
        return "Restaurant "+this.name+" has "+this.numberOfEmployees+" employees.";
    }

    @Override
    public String serveFood() {
        return "Sushi";
    }

    @Override
    public void receivePayment(String type, double amount) {
        if (type.equals("CASH")) {
            this.cashMoney = this.cashMoney + amount;
        }
        else {
            System.out.println("Sorry, we only accept Cash Payments.");
        }

    }

    @Override
    public void giveRest(double amount) {
        this.cashMoney = this.cashMoney - amount;

    }
}
