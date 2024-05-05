package com.zeroonejourney.arrayandstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseVowelsTest {
    @Test
    public void testReverseVowelsSolution() {
        ReverseVowels rv = new ReverseVowels();
        assertEquals("leotcede", rv.solution("leetcode"));
        assertEquals("hello", rv.solution("holle"));
        assertEquals("", rv.solution(""));
        assertEquals("ia", rv.solution("ai"));
        assertEquals(
                "Marge, let's \"went.\" i awaIt news telegram.",
                rv.solution("Marge, let's \"went.\" I await news telegram."));
        assertEquals(
                "Tide-net safe, soon, allin. a mAnillA noose fastened it.",
                rv.solution("Tide-net safe, soon, Allin. A manilla noose fastened it."));
    }
}
