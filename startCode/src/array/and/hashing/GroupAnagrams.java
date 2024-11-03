package array.and.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String s : strs){
            int count[] = new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            String key = Arrays.toString(count);
            if(!map.containsKey(key))
                map.put(key,new ArrayList<String>());
            map.get(key).add(s);
        }
        List<List<String>> ans = new ArrayList();
        for(List<String> list : map.values()){
            ans.add(list);
        }
        return ans;
    }


}
