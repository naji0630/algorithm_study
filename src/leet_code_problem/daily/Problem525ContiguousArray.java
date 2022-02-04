package leet_code_problem.daily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem525ContiguousArray {
    public int findMaxLength(int[] nums) {

        int count = 0;

        HashMap<Integer, Integer> min = new HashMap<>();
        HashMap<Integer, Integer> max = new HashMap<>();

        min.put(0, -1);

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count -= 1;
            }else{
                count += 1;
            }

            if(!min.containsKey(count)){
                min.put(count, i);
            }
            max.put(count, i);
        }

        Set<Integer> keys = new HashSet<>();
        keys.addAll(max.keySet());
        keys.addAll(min.keySet());

        int maxLength = 0;

        for (Integer x : keys){
            if(max.containsKey(x) && min.containsKey(x)){
                if( (max.get(x)-min.get(x)) > maxLength){
                    maxLength = max.get(x)-min.get(x);
                }
            }
        }

        return maxLength;
    }
}
