package leet_code_problem.daily;

import java.util.Arrays;

public class Problem389FindTheDifference {

    public char findTheDifference(String s, String t) {
        char[] ArrayS = s.toCharArray();
        char[] ArrayT = t.toCharArray();

        Arrays.sort(ArrayS);
        Arrays.sort(ArrayT);

        int i = 0;
        while(i<s.length() && ArrayS[i]==ArrayT[i])
        {
            i++;
        }
        return ArrayT[i];
    }
}
