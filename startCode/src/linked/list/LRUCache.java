package linked.list;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Map<Integer,Integer> cache ;
    int capacity;
    LinkedHashSet<Integer> set;
    public LRUCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;
        set = new LinkedHashSet<>();
    }
    
    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;
        set.remove(key);
        set.add(key);
        return cache.get(key);

    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key))
            set.remove(key);
        else{
            if(cache.size()>=capacity){
                int keyy = set.iterator().next();
                set.remove(keyy);
                cache.remove(keyy);
            }
        }
        set.add(key);
        cache.put(key,value);
    }

}
