package leet_code_problem.daily;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem78Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        if (set.size() != 0) {
            recur(set, ans);
        }
        return ans;

    }

    public void recur(Set<Integer> nums, List<List<Integer>> ans) {
        if(nums.size()!=0){
            HashSet<Integer> set = new HashSet<>();

            nums.forEach(x->{
                set.add(x);
                nums.remove(x);
                recur(nums, ans);
                nums.add(x);
            });

            ans.add(new ArrayList<>(set));
        }
    }


}
