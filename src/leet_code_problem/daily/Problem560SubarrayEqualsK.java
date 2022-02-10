package leet_code_problem.daily;

import java.util.Arrays;

public class Problem560SubarrayEqualsK {
    public int subarraySum(int[] nums, int k) {

        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
                if(k<sum){
                    break;
                }
            }
        }
        return count;
    }
}
