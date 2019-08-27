package Begin.problem4;

import org.junit.jupiter.api.Test;

import static Begin.problem4.Begin4.circleCircumference;
import static org.junit.jupiter.api.Assertions.*;

class Begin4Test {

    @Test
    void circleCircumferenceTest() {
        assertEquals(Math.PI*3, circleCircumference(3));
        assertEquals(0, circleCircumference(0));
        assertThrows(IllegalArgumentException.class, () -> circleCircumference(-2));
    }
}