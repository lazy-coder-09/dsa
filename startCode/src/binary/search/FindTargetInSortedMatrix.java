package binary.search;

public class FindTargetInSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean searchMatrix(int[][] matrix, int target) {
        //log(m*n)
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        if(target<matrix[0][0] || target>matrix[n][m]) return false;
        int top=0;int bottom = n;
        while(top<=bottom){
            int mid = (top+bottom)/2;
            if(target>matrix[mid][m])
                top=mid+1;
            else if(target<matrix[mid][0])
                bottom = mid-1;
            else
                break;
        }
        int row=(top+bottom)/2;
        int start = 0;int end = m;
        while(start<=end){
            int mid = (start+end)/2;
            if(matrix[row][mid] == target) return true;
            if(target<matrix[row][mid]) end = mid-1;
            if(target>matrix[row][mid]) start = mid+1;
        }
        return false;
    }

}
