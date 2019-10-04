package piggybank;

public class Dime extends Money {
    public Dime(int moneyAmount) {
        super(moneyAmount);
        this.val = 0.10;
    }

    public Dime() {
        super();
        this.val = 0.10;
    }

    @Override
    public void printMoneyAmount() {
        if (moneyAmount == 1) {
            System.out.println(moneyAmount + " Dime");
        } else {
            System.out.println(moneyAmount + " Dimes");
        }
    }
}