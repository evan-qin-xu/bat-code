package com.zeroonejourney.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxAvgSubArrayTest {
    @Test
    public void testFindMaxAverage() {
        // assertEquals(12.75, MaxAvgSubArray.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        assertEquals(5.0, MaxAvgSubArray.findMaxAverage(new int[] {5}, 1));
    }
}
