package two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeIntegerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Time complexity = O(n^2) and Space Complexity = O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        if(nums.length<3) 
            return result;
        Arrays.sort(nums);
        for(int index=0;index<nums.length-2;index++){
            if(index>0 && nums[index]==nums[index-1])
		        continue;
	        int left = index+1;
	        int right = nums.length-1;
	        while(left<right){
                int sum = nums[index]+nums[left]+nums[right];
		        if(sum==0){
			        result.add(Arrays.asList(nums[index],nums[left],nums[right]));
                    //add left<right before else [0,0,0] will fail
                    while(left<right && nums[left]==nums[left+1])
	                    left++;
                    while(left<right && nums[right]==nums[right-1])
	                    right--;
                    left++;
                    right--;
		        }else if(sum>0)
			        right--;
		        else
			        left++;
	        }
        } 
    return result;
    }

}
