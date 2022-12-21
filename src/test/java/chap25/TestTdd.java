package chap25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTdd {

    /*@DisplayName("환전하는 테스트")
    @Test
    void testReduce() {
        // given
        Bank bank = new Bank();
        bank.addRate("USD", "GBP", STANDARD_RATE);
        bank.commission(STANDARD_COMMISSION);

        // when
        Money result = bank.convert(new Note(100, "USD"), "GBP");

        // then
        assertEquals(new Note(49.25, "GBP"), result);
    }*/

    /*@DisplayName("환전하는 테스트")
    @Test
    void testReduce() {
        // given
        Bank bank = new Bank();
        bank.addRate("USD", "GBP", 2);
        bank.commission(0.015);

        // when
        Money result = bank.convert(new Note(100, "USD"), "GBP");

        // then
        assertEquals(new Note(100 / 2 * (1 - 0.015), "GBP"), result);
    }*/

    /*@DisplayName("시작 테스트 패턴 테스트")
    @Test
    void testStartTestPattern() {
        Reducer r = new Reducer(new Polygon());
        assertEquals(0, reducer.result().npoints());
    }*/

    /*@DisplayName("시작 테스트 패턴 테스트")
    @Test
    void testStartTestPattern() {
        Socket socket = new Socket();
        String message = "Hello";
        socket.write(message);
        assertEquals(message, socket.read());
    }*/

    /*@DisplayName("목 객체 테스트")
    @Test
    void testOrderLookUp() {
        Database db = new MockDatabase();
        db.expectQuery("SELECT order_no FROM Order WHERE cust_no IS 123");
        db.return Result(new String[] {"Order 2", "Order 2"});
        ...
    }*/

    

}
