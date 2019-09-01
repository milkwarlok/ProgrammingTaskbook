package Begin.problem8;

import org.junit.jupiter.api.Test;

import static Begin.problem8.Begin8.arithmeticMean;
import static org.junit.jupiter.api.Assertions.*;

class Begin8Test {

    @Test
    void arithmeticMeanTest() {
        assertEquals(2, arithmeticMean(0, 4));
        assertEquals(2, arithmeticMean(2, 2));
        assertEquals(0, arithmeticMean(-2, 2));
        assertEquals(0, arithmeticMean(0, 0));
    }
}