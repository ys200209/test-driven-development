package chap10;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplier) {
//        return Money.dollar(amount * multiplier);
//        return new Dollar(amount * multiplier, currency);
        return new Money(amount * multiplier, currency());
    }
}
