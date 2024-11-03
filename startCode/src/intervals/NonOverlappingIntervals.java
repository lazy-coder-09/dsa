package intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//T = O(nlogn) S = O(1)
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        int prevEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start>=prevEnd)
                prevEnd = end;
            else{
                count++;
                prevEnd = Math.min(end,prevEnd);
            }
        }
        return count;
    }

}
