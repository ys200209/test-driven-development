package chap28;

public class MyDate {
    private final String dayText;

    public MyDate(String dayText) {
        this.dayText = dayText;
    }

    public MyDate yesterday() {
        //  return new MyDate("28.2.02");
        //  return new MyDate("1.3.02".days() - 1);
//        return new MyDate(this.days() - 1);
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        MyDate myDate = (MyDate) obj;
        return dayText.equals(myDate.dayText);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
