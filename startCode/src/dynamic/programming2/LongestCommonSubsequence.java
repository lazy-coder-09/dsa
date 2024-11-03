package dynamic.programming2;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int dp[][] = new int[n1+1][n2+1];
        for(int row=1;row<=n1;row++){
            for(int col=1;col<=n2;col++){
                dp[row][col]=-1;
            }
        }
        findLCS(text1,text2,n1,n2,dp);
        return dp[n1][n2];
    }
    private int findLCS(String text1, String text2,int n1,int n2,int[][] dp){
        if(n1==0 || n2==0)
            return 0;
        if(dp[n1][n2]!=-1)
            return dp[n1][n2];
        else if(text1.charAt(n1-1)==text2.charAt(n2-1))
            return dp[n1][n2]=1+findLCS(text1,text2,n1-1,n2-1,dp);
        else
            return dp[n1][n2]=Math.max(findLCS(text1,text2,n1,n2-1,dp),findLCS(text1,text2,n1-1,n2,dp));
    }

}
