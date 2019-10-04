package piggybank;

public class Dollar extends Money {
    public Dollar(int moneyAmount) {
        super(moneyAmount);
        this.val = 1.00;
    }

    public Dollar() {
        super();
        this.val = 1.00;
    }

    @Override
    public void printMoneyAmount() {
        System.out.println("$" + moneyAmount);
    }
}