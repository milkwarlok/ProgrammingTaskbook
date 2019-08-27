package Begin.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Begin.problem1.Begin1.squarePerimeter;

class Begin1Test {

    @Test
    void squarePerimeterTest() {
        assertEquals(12, squarePerimeter(3));
        assertEquals(0, squarePerimeter(0));
        assertThrows(IllegalArgumentException.class, () -> squarePerimeter(-1));
    }


}