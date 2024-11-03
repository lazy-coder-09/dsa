package greedy;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum<0)
                sum=0;
            sum+=nums[i];
            max = Math.max(sum,max);
        }
        return max;
    }

}
