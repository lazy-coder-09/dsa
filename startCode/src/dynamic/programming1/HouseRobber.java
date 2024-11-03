package dynamic.programming1;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int dp[]= new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int index=2;index<nums.length;index++){
            dp[index]=Math.max(dp[index-2]+nums[index],dp[index-1]);
        }
        return dp[nums.length-1];
    }
	
	 public int rob1(int[] nums) {
	        int rob1 =0;
	        int rob2 =0;
	        for(int num :nums){
	            int temp = Math.max(rob1+num,rob2);
	            rob1 = rob2;
	            rob2 = temp;
	        }
	        return rob2;
	    }
	


}
