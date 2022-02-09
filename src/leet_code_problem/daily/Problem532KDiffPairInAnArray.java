package leet_code_problem.daily;

import java.util.Arrays;
import java.util.HashSet;

public class Problem532KDiffPairInAnArray {

    public int findPairs(int[] nums, int k) {

        HashSet<Integer> map = new HashSet<>();
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (k < nums[j] - nums[i]) {
                    break;
                }
                if (nums[j] - nums[i] == k) {
                    if (!map.contains(nums[j])) {
                        count++;
                        map.add(nums[j]);
                    }
                }
            }
        }
        return count;

    }
}
