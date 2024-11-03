package dynamic.programming1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canPartition(int[] nums) {
        if(Arrays.stream(nums).sum()%2!=0)
            return false;
        Set<Integer> dp = new HashSet<>();
        dp.add(0);
        int target = Arrays.stream(nums).sum()/2;
        for(int i=nums.length-1;i>=0;i--){
            Set<Integer> set = new HashSet<>();
            for(int n : dp){
                if(n+nums[i]==target)
                    return true;
                set.add(nums[i]+n);
                set.add(n);
            }
            dp=set;
        }
        return false;
    }

}
