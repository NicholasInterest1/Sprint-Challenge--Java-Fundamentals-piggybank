package piggybank;

public class Penny extends Money {
    public Penny(int moneyAmount) {
        super(moneyAmount);
        this.val = 0.01;
    }

    public Penny() {
        super();
        this.val = 0.01;
    }

    @Override
    public void printMoneyAmount() {
        if (moneyAmount == 1) {
            System.out.println(moneyAmount + " Penny");
        } else {
            System.out.println(moneyAmount + " Pennies");
        }
    }
}