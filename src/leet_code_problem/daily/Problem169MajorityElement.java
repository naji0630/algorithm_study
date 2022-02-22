package leet_code_problem.daily;

import java.util.HashMap;

public class Problem169MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length/2; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int max = 0;
        int maxValue = 0;
        for(Integer key:map.keySet()){
            if(maxValue<map.get(key)){
                max = key;
            }
        }
        return max;
    }
}
