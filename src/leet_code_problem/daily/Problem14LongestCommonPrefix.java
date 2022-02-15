package leet_code_problem.daily;

public class Problem14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        char [][] arr = new char[200][200];
        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            for(int j = 0; j<str.length(); j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for(int j=0; j<200; j++){
            for(int i=0; i<199; i++){
                if(arr[i][j] != arr[i+1][j]){
                    System.out.println(strs[0]);
                    System.out.println(j);
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0].substring(0, 200);
    }
}
