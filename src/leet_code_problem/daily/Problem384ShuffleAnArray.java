package leet_code_problem.daily;

import java.util.Arrays;

public class Problem384ShuffleAnArray {

    int[] init;
    int[] nums;

    public Problem384ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.init = Arrays.copyOf(nums, nums.length);
    }

    public int[] reset() {
        this.nums = Arrays.copyOf(init, init.length);
        return this.nums;
    }

    public int[] shuffle() {
        for(int i=0; i<nums.length; i++){
            swap(i, (int) Math.floor(nums.length * Math.random()));
        }
        return this.nums;
    }

    public void swap(int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
