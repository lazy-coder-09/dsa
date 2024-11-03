package dynamic.programming1;

import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && wordDict.contains(s.substring(j,i)))
                    dp[i]=true;
            }
        }
        return dp[s.length()];
    }

}
