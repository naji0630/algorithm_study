package leet_code_problem.daily;

public class Problem2128RemoveAllOnesWithRowAndColumnFlips {
    public boolean removeOnes(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(m==1){
            return true;
        }
        for(int i=0; i<m-1; i++){
            if(!isSamePattern(grid[i], grid[i+1])){
                return false;
            }
        }
        return true;
    }

    public boolean isSamePattern(int [] arr1, int [] arr2){
        if(arr1[0]==arr2[0]){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        }else{
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]==arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
