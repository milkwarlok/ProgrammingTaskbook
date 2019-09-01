package Begin.problem9;

import org.junit.jupiter.api.Test;

import static Begin.problem9.Begin9.geometricMean;
import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class Begin9Test {

    @Test
    void geometricMeanTest() {
        assertEquals(1,geometricMean(1, 1));
        assertEquals(NaN, geometricMean(-1, 1));
        assertEquals(1, geometricMean(-1, -1));
    }
}