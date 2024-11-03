package dynamic.programming1;

public class ClimbingStairs {
	
	/* Problem:
	 * You are given an integer n representing the number of steps to reach the top of a staircase. You can climb with either 1 or 2 steps at a time.Return the number of distinct
	 *  ways to climb to the top of the staircase. Example 1: Input: n = 2 Output: 2
	 *	Explanation: 1 + 1 = 2		
	 *				 2 = 2
	 *	Example 2: Input: n = 3   Output: 3
	 */
	

	public static void main(String[] args) {
		
		System.out.println(climbStairs(10));
		System.out.println(climbStairsByDP(10));
		// Testcases :- 0,1,2,3,5,8,13,21,34,55,89
	}
	
	public static int climbStairsByDP(int n) {
		//TC = O(n) SC = O(n)
        int[] dp =new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++) {
        	if(i<=3)
        		dp[i]=i;
        	else
        		dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
	
	public static int climbStairs(int n) {
		//TC = O(n) SC = O(1)
        if(n==0)return 0;
        int pre1 =0;
        int pre2 =1;
        for(int i=0;i<n;i++) {
        	int sum = pre1+pre2;
        	pre1 = pre2;
        	pre2 = sum;
        }
        return pre2;
    }

}
