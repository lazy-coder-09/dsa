package two.pointers;

public class TwoIntegerSumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//complexity Space O(1) and Time O(n)
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target)
                return new int[]{l+1,r+1};
            else if(numbers[l]+numbers[r]>target)
                r--;
            else
                l++;
        }
        return new int[2];
    }

}
