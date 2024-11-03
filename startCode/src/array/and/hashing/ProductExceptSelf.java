package array.and.hashing;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] productExceptSelf(int[] nums) {
        //using pre & post multiply array concept
        //in first loop we will fill prefix multiply
        //in 2nd go we will multiply the postfix product after the ith val
        int[] res = new int[nums.length];
        int prefix = 1,postfix=1;
        for(int i=0;i<nums.length;i++){
            res[i]=prefix;
            prefix *=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*postfix;
            postfix *=nums[i];
        }
        return res;
    }

}
