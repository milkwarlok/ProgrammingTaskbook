package Begin.problem7;

import org.junit.jupiter.api.Test;

import static Begin.problem7.Begin7.circleArea;
import static org.junit.jupiter.api.Assertions.*;

class Begin7Test {

    @Test
    void circleAreaTest() {
        assertEquals(2*2*Math.PI, circleArea(2));
        assertEquals(0, circleArea(0));
        assertThrows(IllegalArgumentException.class, () -> circleArea(-1));
    }

    @Test
    void circleCircumferenceTest() {
        assertEquals(2*2*Math.PI, circleArea(2));
        assertEquals(0, circleArea(0));
        assertThrows(IllegalArgumentException.class, () -> circleArea(-1));
    }
}