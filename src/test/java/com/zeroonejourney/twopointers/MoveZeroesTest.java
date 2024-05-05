package com.zeroonejourney.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoveZeroesTest {
    @Test
    public void testMoveZeroes() {
        MoveZeroes mz = new MoveZeroes();
        mz.move();
        assertArrayEquals(new int[] {0}, mz.getNums());

        mz.setNums(new int[] {0, 1, 0, 3, 12});
        mz.move();
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, mz.getNums());
    }
}
