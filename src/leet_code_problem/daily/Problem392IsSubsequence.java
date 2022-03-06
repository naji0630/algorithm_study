package leet_code_problem.daily;

public class Problem392IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int j=0;
        for(int i=0; i<s.length(); i++){
            if(t.length()<=j){
                return false;
            }
            while(s.charAt(i)!=t.charAt(j)){
                j++;
                if(t.length()<=j){
                    return false;
                }
            }

            j++;
        }

        return true;

    }
}
