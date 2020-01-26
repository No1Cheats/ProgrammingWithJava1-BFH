package Inheritence2;

public class PizzeriaItaliana extends Restaurant implements PayableInCash, PayableByCard {

    private double cashMoney=0.0;
    private double bankAccountBalance=0.0;

    public PizzeriaItaliana(String name) {
        this.name = name;
    }

    @Override
    public String serveFood() {
        return "Piiizza";
    }

    @Override
    public void setNumberOfEmployees(int number) {
        this.numberOfEmployees = number;
    }
    public String toString() {
        return "Restaurant "+this.name+" has "+this.numberOfEmployees+" employees.";
    }

    @Override
    public void receiveTipInCash(double amount) {
        this.cashMoney = this.cashMoney+amount;

    }

    @Override
    public void receivePayment(String type, double amount) {
        if (type.equals("CARD")) {
            this.bankAccountBalance = this.bankAccountBalance + amount;
        }
        else {
            this.cashMoney = this.cashMoney + amount;
        }

    }

    @Override
    public void giveRest(double amount) {
        this.cashMoney = this.cashMoney - amount;

    }

}
