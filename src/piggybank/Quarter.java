package piggybank;

public class Quarter extends Money {
    public Quarter(int moneyAmount) {
        super(moneyAmount);
        this.val = 0.25;
    }

    public Quarter() {
        super();
        this.val = 0.25;
    }

    @Override
    public void printMoneyAmount() {
        if (moneyAmount == 1) {
            System.out.println(moneyAmount + " Quarter");
        } else {
            System.out.println(moneyAmount + " Quarters");
        }
    }
}