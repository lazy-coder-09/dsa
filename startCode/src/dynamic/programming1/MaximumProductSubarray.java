package dynamic.programming1;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProduct(int[] nums) {
        double left = 1;
        double right = 1;
        double ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(left == 0) left=1;
            if(right == 0) right=1;
            left*=nums[i];
            right*=nums[nums.length-i-1];
            ans = Math.max(ans,Math.max(left,right));
        }
        return (int)ans;
    }

}
