package leet_code_problem.daily;

import java.util.Arrays;

public class Problem1877MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length/2 ;i++){
            if(max < nums[i] + nums[nums.length-i-1]){
                max = nums[i] + nums[nums.length-i-1];
            }
        }
        return max;
    }
}
