package leet_code_problem.daily;

import java.util.HashMap;

public class Problem359LoggerRateLimiter {

    HashMap<String, Integer> map;
    public Problem359LoggerRateLimiter() {
        map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message)){
            if(map.get(message)<=timestamp){
                map.put(message, timestamp+10);
                return true;
            }else{
                return false;
            }
        }else{
            map.put(message, timestamp+10);
            return true;
        }
    }
}
