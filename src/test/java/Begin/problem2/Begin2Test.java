package Begin.problem2;

import org.junit.jupiter.api.Test;

import static Begin.problem2.Begin2.squareArea;
import static org.junit.jupiter.api.Assertions.*;

class Begin2Test {

    @Test
    void squareAreaTest() {
        assertEquals(9, squareArea(3));
        assertEquals(0, squareArea(0));
        assertThrows(IllegalArgumentException.class, () -> squareArea(-1));
    }
}