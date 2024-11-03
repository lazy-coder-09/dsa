package binary.search;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findMin(int[] nums) {
        int left = 0; int right = nums.length-1,mid;
        while(left<=right){
            if(nums[left]<=nums[right])
                return nums[left];
            mid = (left+right)/2;
            if(nums[left]<=nums[mid])
                left=mid+1;
            else
                right=mid;
        }
        return 0;
    }
}
