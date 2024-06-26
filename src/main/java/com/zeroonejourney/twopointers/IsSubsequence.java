package com.zeroonejourney.twopointers;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise. A
 * subsequence of a string is a new string that is formed from the original string by deleting some
 * (can be none) of the characters without disturbing the relative positions of the remaining
 * characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] sSubs = s.toCharArray();
        char[] tSubs = t.toCharArray();
        int i = 0, j = 0;
        int sLength = sSubs.length;
        while (i < sLength && j < tSubs.length) {
            if (sSubs[i] == tSubs[j]) {
                i++;
            }
            j++;
        }
        return i == sLength;
    }
}
