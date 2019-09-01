package Begin.problem10;

import org.junit.jupiter.api.Test;

import static Begin.problem10.Begin10.squaresSummary;
import static org.junit.jupiter.api.Assertions.*;

class Begin10Test {

    @Test
    void squaresSummaryTest() {
        Begin10.SquaresSummary sq1 = squaresSummary(2, 3);
        Begin10.SquaresSummary sq2 = squaresSummary(0, 1);

        assertEquals(13, sq1.getSum());
        assertEquals(-5, sq1.getDifference());
        assertEquals(36, sq1.getProduct());
        assertEquals(4./9, sq1.getQuotient());
        assertThrows(IllegalArgumentException.class, () -> squaresSummary(1, 0));

        assertEquals(1, sq2.getSum());
        assertEquals(-1, sq2.getDifference());
        assertEquals(0, sq2.getProduct());
        assertEquals(0, sq2.getQuotient());
    }
}