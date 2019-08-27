package Begin.problem3;

import org.junit.jupiter.api.Test;

import static Begin.problem3.Begin3.rectArea;
import static Begin.problem3.Begin3.rectPerimeter;
import static org.junit.jupiter.api.Assertions.*;

class Begin3Test {

    @Test
    void rectAreaTest() {
        assertEquals(12, rectArea(3, 4));
        assertEquals(0, rectArea(0, 4));
        assertEquals(0, rectArea(3, 0));
        assertEquals(0, rectArea(0, 0));
        assertThrows(IllegalArgumentException.class, () -> rectArea(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> rectArea(1, -2));
        assertThrows(IllegalArgumentException.class, () -> rectArea(-1, -2));
    }

    @Test
    void rectPerimeterTest(){
        assertEquals(14, rectPerimeter(3, 4));
        assertEquals(8, rectPerimeter(0, 4));
        assertEquals(6, rectPerimeter(3, 0));
        assertEquals(0, rectPerimeter(0, 0));
        assertThrows(IllegalArgumentException.class, () -> rectArea(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> rectArea(1, -2));
        assertThrows(IllegalArgumentException.class, () -> rectArea(-1, -2));
    }
}