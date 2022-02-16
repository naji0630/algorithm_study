package leet_code_problem.daily;

public class Problem9PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1)){
                return false;
            }
        }
        return true;
    }
}
