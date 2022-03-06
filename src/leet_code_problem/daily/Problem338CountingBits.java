package leet_code_problem.daily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem338CountingBits {

    public int[] countBits(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(1);
        Queue<Integer> queue = new LinkedList<>();

        int start = 1;
        queue.add(start);

        int count = 0;
        while (n > Math.pow(2, count)) {
            List<Integer> arr = new ArrayList<>();
            while (!queue.isEmpty()) {
                arr.add(queue.poll());
            }
            queue.addAll(arr);

            for (int i = 0; i < arr.size(); i++) {
                queue.add(arr.get(i) + 1);
            }
            count++;
            queue.forEach(x -> ans.add(x));
        }

        int [] a = new int[n+1];
        for(int i=0; i<=n; i++){
            a[i] = (ans.get(i));
        }
        return a;
    }
}
