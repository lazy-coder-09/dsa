package array.and.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] topKFrequent(int[] nums, int k) {
	        //using bucket sort both time & space is O(n)
	        int result[] = new int[k];
	        Map<Integer,Integer> freqMap = new HashMap();
	        for(int num : nums)
	            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
	        //storig the int values in index as frequencies
	        List<Integer> bucket[] = new ArrayList[nums.length+1];
	        for(int key : freqMap.keySet()){
	            int freq = freqMap.get(key);
	            if(bucket[freq] == null)
	                bucket[freq] = new ArrayList();
	            bucket[freq].add(key);
	        }
	        int index=0;
	        for(int i=bucket.length-1;i>=0;i--){
	            if(bucket[i]!=null){
	                for(int n : bucket[i]){
	                    result[index++]=n;
	                    if(index==k)return result;
	                }
	            }
	        }
	        return result;
	    }

}
