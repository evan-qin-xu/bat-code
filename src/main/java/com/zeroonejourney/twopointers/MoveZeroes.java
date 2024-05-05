package com.zeroonejourney.twopointers;

public class MoveZeroes {
    private int[] nums;

    public MoveZeroes() {
        this.nums = new int[] {0};
    }

    public void move() {
        int i = 0;
        int j = i + 1;
        while (j < nums.length) {
            if (nums[i] == 0) {
                if (nums[j] == 0) {
                    j++;
                    continue;
                } else {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
            i++;
            j = i + 1;
        }
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }
}
