package Begin.problem6;

import org.junit.jupiter.api.Test;

import static Begin.problem6.Begin6.parallelepipedSurfaceArea;
import static Begin.problem6.Begin6.parallelepipedVolume;
import static org.junit.jupiter.api.Assertions.*;

class Begin6Test {

    @Test
    void parallelepipedVolumeTest() {
        assertEquals(24, parallelepipedVolume(2, 3, 4));
        assertEquals(0, parallelepipedVolume(2, 3, 0));
        assertEquals(0, parallelepipedVolume(0, 3, 0));
        assertEquals(0, parallelepipedVolume(0, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> parallelepipedVolume(-1, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> parallelepipedVolume(0, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> parallelepipedVolume(0, 0, -3));
    }

    @Test
    void parallelepipedSurfaceAreaTest() {
        assertEquals(52, parallelepipedSurfaceArea(2, 3, 4));
        assertEquals(12, parallelepipedSurfaceArea(2, 3, 0));
        assertEquals(0, parallelepipedSurfaceArea(0, 3, 0));
        assertEquals(0, parallelepipedSurfaceArea(0, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> parallelepipedSurfaceArea(-1, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> parallelepipedSurfaceArea(0, -2, 0));
        assertThrows(IllegalArgumentException.class, () -> parallelepipedSurfaceArea(0, 0, -3));
    }
}