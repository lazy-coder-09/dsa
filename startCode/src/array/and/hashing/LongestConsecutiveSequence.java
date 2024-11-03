package array.and.hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int longestConsecutive(int[] nums) {
        //lets add the elemnts to a set and find the max sequence
        //finding in a set is O(1)
        //this solution time & space complexity is O(n)
        if(nums.length<=1)return nums.length;
        Set<Integer> set = new HashSet();
        for(int n: nums)
            set.add(n);
        int maxLCS=0;
        for(int n : set){
            if(set.contains(n-1))
                continue;
            else{
                int num = n;
                int count = 1;
                while(set.contains(num+1)){
                    num++;count++;
                }
                maxLCS=Math.max(maxLCS,count);
            }
        }
        return maxLCS;
    }

}
