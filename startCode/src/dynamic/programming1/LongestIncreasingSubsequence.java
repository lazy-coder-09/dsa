package dynamic.programming1;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len==0)return 0;
        int dp[] = new int[len];
        Arrays.fill(dp,1);
        int ans = 1;
        for(int index=1;index<len;index++){
            for(int leftIndex=index-1;leftIndex>=0;leftIndex--){
                if(nums[index]>nums[leftIndex])
                    dp[index]=Math.max(dp[index],dp[leftIndex]+1);
            }
            ans = Math.max(ans,dp[index]);
        }
        return ans;
    }
}
