package com.zeroonejourney.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsSubsequenceTest {
    @Test
    public void testIsSubsequence() {
        assertTrue(IsSubsequence.isSubsequence("abc", "ahbgdc"));
        assertFalse(IsSubsequence.isSubsequence("axc", "ahbgdc"));
        assertFalse(IsSubsequence.isSubsequence("acb", "ahbgdc"));
        assertFalse(IsSubsequence.isSubsequence("aaaaaa", "bbaaaa"));
    }
}
