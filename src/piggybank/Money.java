package piggybank;

import java.text.DecimalFormat;

public abstract class Money {

    DecimalFormat fp = new DecimalFormat("$###,###.00");

    protected double val;
    protected int moneyAmount;

    public Money(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Money() {
        moneyAmount = 1;
    }

    public abstract void printMoneyAmount();

    public void printTotalVal() {
        System.out.println(fp.format(val * moneyAmount));
    }

    public double getTotalVal() {
        return (val * moneyAmount);
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}