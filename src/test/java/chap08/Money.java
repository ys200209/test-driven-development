package chap08;

public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money frank(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
