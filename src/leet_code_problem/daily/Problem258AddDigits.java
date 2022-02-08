package leet_code_problem.daily;

public class Problem258AddDigits {
    public int addDigits(int num) {
        while(10<=num){
            num = addAllDigits(num);
        }
        return num;
    }
    public int addAllDigits(int num){
        if(num<10){
            return num;
        }else{
            return addDigits(num/10) + num%10;
        }
    }
}
