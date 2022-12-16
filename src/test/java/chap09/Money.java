package chap09;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money frank(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public String currency() {
        return currency;
    }
}
