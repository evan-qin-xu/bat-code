package com.zeroonejourney.prefixsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestAltitudeTest {
    @Test
    public void testLargestAltitude() {
        assertEquals(1, LargestAltitude.solution(new int[] {-5, 1, 5, 0, -7}));
        assertEquals(0, LargestAltitude.solution(new int[] {-4, -3, -2, -1, 4, 3, 2}));
    }
}
