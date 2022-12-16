package chap11;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
//        return Money.frank(amount * multiplier);
//        return new Franc(amount * multiplier, currency);
        return new Money(amount * multiplier, currency);
    }
}
