package chap32;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {
    @DisplayName("equilateral triangle 테스트")
    @Test
    void testEquilateralTriangle() {
        // given
        Triangle triangle = new Triangle();

        // when
        triangle.init(1, 1, 1);

        // then
        assertEquals(triangle.result(), 1);
    }

    @DisplayName("isosceles triangle 테스트")
    @Test
    void testIsoscelesTriangle() {
        // given
        Triangle triangle = new Triangle();

        // when
        triangle.init(2, 2, 3);

        // then
        assertEquals(triangle.result(), 2);
    }

    private class Triangle {
        int sideA;
        int sideB;
        int sideC;

        public void init(int sideA, int sideB, int sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public int result() {
            int count = compare();

            return resultTriangle(count);
        }

        private int resultTriangle(int count) {
            if (count == 3) {
                return 1;
            } else if (count == 2) {
                return 2;
            } else {
                return 3;
            }
        }

        private int compare() {
            int count = 0;

            count += compareSide(sideA, sideB);
            count += compareSide(sideA, sideC);
            count += compareSide(sideB, sideC);

            return count;
        }

        private int compareSide(int side1, int side2) {
            if (side1 == side2) {
                return 1;
            }
            return 0;
        }
    }
}
