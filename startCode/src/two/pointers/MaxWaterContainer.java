package two.pointers;

public class MaxWaterContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length-1;
        int maxArea = 0;
        while(left<right){
            int breadth = right-left;
            int area = breadth*Math.min(heights[left],heights[right]);
            maxArea = Math.max(maxArea,area);
            if(heights[left]<=heights[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

}
