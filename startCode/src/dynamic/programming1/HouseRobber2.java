package dynamic.programming1;

public class HouseRobber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        return Math.max(robHouse(nums,0,nums.length-2),robHouse(nums,1,nums.length-1));
    }
    public int robHouse(int nums[], int start,int end){
        int prev1 =0;
        int justbefore = nums[start];
        for(int i=start+1;i<=end;i++){
            int max = Math.max(justbefore,nums[i]+prev1);
            prev1 = justbefore;
            justbefore = max;
        }
        return justbefore;
    }

}
