package leet_code_problem.daily;

public class Problem171ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {

        int total = 0;

        for(int i=columnTitle.length()-1; -1<i; i--){
            total = total + ((int)Math.pow(26,columnTitle.length()-i-1)) * ((int)columnTitle.charAt(i)-64);
        }
        return total;
    }
}
