package chap08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {
    @DisplayName("생성자로 받은 초기 값에 곱해진 값으로 새로운 객체를 생성하는 테스트")
    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @DisplayName("프랑(Franc) 테스트")
    @Test
    void testFrancMultiplication() {
        Money five = Money.frank(5);
        assertEquals(Money.frank(10), five.times(2));
        assertEquals(Money.frank(15), five.times(3));
    }

    @DisplayName("객체 동일성 & 동등성 테스트")
    @Test
    void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertEquals(Money.frank(5), Money.frank(5));
        assertNotEquals(Money.frank(5), Money.frank(6));
    }
}
