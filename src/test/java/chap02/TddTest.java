package chap02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {
    @DisplayName("생성자로 받은 초기 값에 곱해진 값으로 새로운 객체를 생성하는 테스트")
    @Test
    void testMultiplication() {
        // given
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
