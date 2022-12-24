package chap28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {

    /*@DisplayName("MyDate 테스트")
    @Test
    void testMyDate() {
        assertEquals(new MyDate("28.2.02"), new MyDate("1.3.02").yesterday());
    }*/

    /*@DisplayName("더하기 테스트")
    @Test
    void testSum() {
        assertEquals(4, plus(3, 1));
        assertEquals(7, plus(3, 4));
    }

    private int plus(int augend, int addend) {
        return augend + addend;
    }*/

    @DisplayName("배열의 합 테스트")
    @Test
    void testSum() {
        assertEquals(5, sum(new int[]{5}));
    }

    private int sum(int[] values) {
        int sum = 0;

        for (int number : values) {
            sum += number;
        }

        return sum;
    }
}
