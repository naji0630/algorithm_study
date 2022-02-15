package leet_code_problem.daily;

import java.util.HashSet;
import java.util.Set;

public class Problem136SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return set.stream().findFirst().get();
    }
}
