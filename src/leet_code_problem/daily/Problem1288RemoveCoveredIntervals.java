package leet_code_problem.daily;

import java.util.Arrays;

public class Problem1288RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b)->{
            if(a[0] < b[0]){
                return -1;
            }else if(b[0] < a[0]){
                return 1;
            }else{
                if(a[1] < b[1]){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        int count = 0;
        int [] chk = new int[intervals.length];
        for(int i=0; i<intervals.length-1; i++){
            if(chk[i] != -1){

                int rightValue = intervals[i][1];
                for(int j=i+1; j<intervals.length; j++){
                    if(chk[j] != -1){
                      if(intervals[j][1]<=rightValue){
                          chk[j] = -1;
                          count++;
                      }
                    }
                }
            }
        }
        return intervals.length-count;

    }
}
