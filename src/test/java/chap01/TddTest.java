package chap01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {
    @DisplayName("곱해서 객체의 필드를 변경시키는 테스트")
    @Test
    void testMultiplication() {
        // given
        Dollar five = new Dollar(5);

        // when
        five.times(2);

        // then
        assertEquals(10, five.amount);
    }
}