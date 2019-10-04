package piggybank;

public class Nickel extends Money {
    public Nickel(int moneyAmount) {
        super(moneyAmount);
        this.val = 0.05;
    }

    public Nickel() {
        super();
        this.val = 0.05;
    }

    @Override
    public void printMoneyAmount() {
        if (moneyAmount == 1) {
            System.out.println(moneyAmount + " Nickel");
        } else {
            System.out.println(moneyAmount + " Nickels");
        }
    }
}