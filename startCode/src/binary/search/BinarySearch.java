package binary.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int search(int[] nums, int target) {
        if(nums.length==0) return -1;
        int startIndex=0,endIndex=nums.length-1;
        while(startIndex<=endIndex){
            int mid = (startIndex+endIndex)/2;
            if(target==nums[mid]) return mid;
            else if(target>nums[mid])
                startIndex++;
            else
                endIndex--;
        }
        return -1;
    }
}
