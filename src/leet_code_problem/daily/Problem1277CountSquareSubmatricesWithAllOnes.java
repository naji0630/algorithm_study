package leet_code_problem.daily;

public class Problem1277CountSquareSubmatricesWithAllOnes {

    public int countSquares(int[][] matrix) {
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int maxLength = Math.min(m, n);

        for (int len = 1; len < maxLength+1; len++) {
            for(int start_i = 0; start_i<m-len; start_i++){
                for(int start_j=0; start_j<n-len; start_j++){
                    if(len*len == calc(matrix, start_i, start_j, len)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int calc(int [][] matrix, int start_i, int start_j, int len){
        int count = 0;
        for(int i = start_i; i<start_i+len; i++){
            for(int j=start_j; j<start_j+len; j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}
