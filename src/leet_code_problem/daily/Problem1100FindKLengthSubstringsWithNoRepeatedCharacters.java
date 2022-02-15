package leet_code_problem.daily;

import java.util.HashMap;

public class Problem1100FindKLengthSubstringsWithNoRepeatedCharacters {

    public int numKLenSubstrNoRepeats(String s, int k) {
        int count = 0;
        if (k > s.length()) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (map.values().stream().allMatch(x -> x < 2)) {
            count++;
        }
        for (int i = 1; i < s.length() - k + 1; i++) {

            map.put(s.charAt(i - 1), map.get(s.charAt(i - 1)) - 1);
            map.put(s.charAt(i + k - 1), map.getOrDefault(s.charAt(i + k - 1), 0) + 1);
            if (map.values().stream().allMatch(x -> x < 2)) {
                count++;
            }
        }
        return count;
    }
}
