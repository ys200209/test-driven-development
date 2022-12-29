package chap32;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {
    Triangle triangle;

    @BeforeEach
    public void init() {
        triangle = new Triangle();
    }

    @DisplayName("equilateral triangle 테스트")
    @Test
    void testEquilateralTriangle() {
        // given
        Triangle triangle = new Triangle();

        // then
        assertEquals(triangle.compare(1, 1, 1), 1);
    }

    @DisplayName("isosceles triangle 테스트")
    @Test
    void testIsoscelesTriangle() {
        assertEquals(triangle.compare(2, 2, 3), 2);
    }

    @DisplayName("scalene triangle 테스트")
    @Test
    void testScaleneTriangle() {
        assertEquals(triangle.compare(2, 3, 4), 3);
    }

    private class Triangle {

        public int compare(int sideA, int sideB, int sideC) {
            int[] sizes = sortSize(toArray(sideA, sideB, sideC));
//            validateSizes(sizes);
            int count = getEqualsSizeCount(sizes);

            if (count == 3) {
                return 1;
            } else if (count == 1) {
                return 2;
            } else {
                return 3;
            }
        }

        private int getEqualsSizeCount(int[] sizes) {
            int count = 0;

            for (int i = 0; i < sizes.length - 1; i++) {
                for (int j = i + 1; j < sizes.length; j++) {
                    count += equalSizeCount(sizes[i], sizes[j]);
                }
            }
            return count;
        }

        private int equalSizeCount(int sizeA, int sizeB) {
            if (sizeA == sizeB) {
                return 1;
            }
            return 0;
        }

        private int[] toArray(int sideA, int sideB, int sideC) {
            return new int[]{sideA, sideB, sideC};
        }

        private int[] sortSize(int[] sizes) {
            Arrays.sort(sizes);
            return sizes;
        }
    }
}
