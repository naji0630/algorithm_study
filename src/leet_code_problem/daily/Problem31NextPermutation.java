package leet_code_problem.daily;

public class Problem31NextPermutation {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-1; i>-1; i--){
            if(nums[i-1] < nums[i] || i==1){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
                break;
            }
        }
    }
}
