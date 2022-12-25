package chap30;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TddTest {

    /*public void runBare() throws Throwable {
        setUp();
        try {
            runTest();
        } finally {
            tearDown();
        }
    }*/

    /*Figure selected;
    public void mouseDown() { // 마우스를 누르는 기능
        selected = findFigure();

        if (selected != null) {
            select(selected); // 도형이 찾아지면 도형을 선택하라.
        }
    }

    public void mouseMove() { // 마우스를 움직이는 기능
        if (selected != null) { // 도형을 선택했다면
            move(selected); // 도형을 움직여라
        } else {
            moveSelectionRectangle(); // 선택하는 사각형을 움직여라
        }
    }

    public void mouseUp() { // 마우스를 떼는 기능
        if (selected == null) { // 도형을 선택했다면
            selectAll(); // ?
        }
    }*/

    /*SelectionMode mode;
    Figure selected;

    public void mouseDown() { // 마우스를 누르는 기능
        selected = findFigure();

        if (selected != null) {
            mode = SingleSelection(selected);
        } else {
            mode = MultipleSelection();
        }
    }

    public void mouseMove() { // 마우스를 움직이는 기능
        mode.mouseMove();
    }

    public void mouseUp() { // 마우스를 떼는 기능
        mode.mouseUp();
    }*/

    /*abstract class Report {
        String printMessage;

        public Report(String printMessage) {
            this.printMessage = printMessage;
        }

        void print() {
            Method runMethod = getClass().getMethod(printMessage, null);
            runMethod.invoke(this, new Class[0]);
        }

        private void printHTML() {
        }

        private void printXML() {
        }

        private void printJSON() {
        }
    }*/

    /*@DisplayName("화폐 곱하기 테스트")
    @Test
    void testMultiplication() {
        Dollar five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }*/



}
