package Begin.problem5;

import org.junit.jupiter.api.Test;

import static Begin.problem5.Begin5.cubeSideArea;
import static Begin.problem5.Begin5.cubeVolume;
import static org.junit.jupiter.api.Assertions.*;
class Begin5Test {

    @Test
    void cubeVolumeTest() {
        assertEquals(27, cubeVolume(3));
        assertEquals(0, cubeVolume(0));
        assertThrows(IllegalArgumentException.class, () -> cubeVolume(-2));
    }

    @Test
    void cudeSideAreaTest(){
        assertEquals(54, cubeSideArea(3));
        assertEquals(0, cubeSideArea(0));
        assertThrows(IllegalArgumentException.class, () -> cubeSideArea(-2));
    }
}