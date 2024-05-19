package com.zeroonejourney.slidingwindow;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * <p>Find a contiguous sub-array whose length is equal to k that has the maximum average value and
 * return this value. Any answer with a calculation error less than 10-5 will be accepted.
 */
public class MaxAvgSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        int l = 0, r = l + k, sum = 0, max = 0;
        for (int i = l; i < r; i++) {
            sum += nums[i];
            max = sum;
        }
        while (r < nums.length) {
            sum = sum + nums[r] - nums[l];
            max = Math.max(sum, max);
            l++;
            r++;
        }
        return (double) max / k;
    }
}
