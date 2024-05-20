package com.zeroonejourney.prefixsum;

/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different
 * altitudes. The biker starts his trip on point 0 with altitude equal 0. You are given an integer
 * array gain of length n where gain[i] is the net gain in altitude between points and i + 1 for all
 * (0 <= i < n). Return the highest altitude of a point.
 */
public class LargestAltitude {
    public static int solution(int[] gain) {
        int sum = 0, maxGain = 0;
        for (int i : gain) {
            sum += i;
            maxGain = Math.max(sum, maxGain);
        }
        return maxGain;
    }
}
