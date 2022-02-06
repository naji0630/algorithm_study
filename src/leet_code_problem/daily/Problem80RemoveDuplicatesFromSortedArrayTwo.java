package leet_code_problem.daily;

public class Problem80RemoveDuplicatesFromSortedArrayTwo {
    public int removeDuplicates(int[] nums) {

        int count = 1;
        int ans = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                count++;
                if(count > 2){
                    removeElement(nums, i+1);
                    ans++;
                    count--;
                    i--;
                }
            }else{
                count = 1;
            }
            if(nums.length < i + ans + 3){
                return nums.length - ans;
            }

        }
        return nums.length - ans;
    }

    public void removeElement(int [] nums, int idx){
        for(int i=idx; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
    }
}
