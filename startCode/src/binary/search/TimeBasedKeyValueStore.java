package binary.search;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedKeyValueStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Map<String,TreeMap<Integer,String>> map;
    public TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key,new TreeMap<Integer,String>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            Integer k = map.get(key).floorKey(timestamp);
            if(k!=null)
                return map.get(key).get(k);
        }
        return "";
    }

}
