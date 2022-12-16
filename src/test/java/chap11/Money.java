package chap11;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int amount) {
        return null;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money frank(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    public String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
