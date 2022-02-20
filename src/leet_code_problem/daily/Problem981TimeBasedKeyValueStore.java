package leet_code_problem.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem981TimeBasedKeyValueStore {
    HashMap<String, List<ValueObject>> map;
    public Problem981TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new ValueObject(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if(map.containsKey(key)){

        }
        List<ValueObject> list = map.get(key);
        for(int i=list.size()-1; i>-1; i++){
            if(list.get(i).timeStamp>timestamp){
                return key;
            }
        }
        return null;
    }

    class ValueObject{

        int timeStamp;
        String value;

        ValueObject(int timeStamp, String value){
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }
}
