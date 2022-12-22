package chap28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {

    @DisplayName("MyDate 테스트")
    @Test
    void testMyDate() {
        assertEquals(new MyDate("28.2.02"), new MyDate("1.3.02").yesterday());
    }
}
