package dynamic.programming2;

import java.util.Arrays;

public class CountUniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int uniquePaths(int m, int n) {
        if(m==1 || n==1)
            return 1;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
            dp[i][0]=1;
        for(int i=0;i<n;i++)
            dp[0][i]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
	
	public int uniquePaths2(int m, int n) {
        if(m==1 || n==1) return 1;
        int dp1[] = new int[n];
        Arrays.fill(dp1,1);
        int dp2[] = new int[n];
        dp2[0]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp2[j]=dp1[j]+dp2[j-1];
            }
            dp1=dp2;
        }
        return dp2[n-1];
    }

}
