package dynamic.programming1;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String maxStr = s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String left = checkPalindrome(s,i,i);
            String right = checkPalindrome(s,i,i+1);
            if(left.length()>maxStr.length())
                maxStr = left;
            if(right.length()>maxStr.length())
                maxStr = right;
        }
        return maxStr;
    }
    String checkPalindrome(String s,int start,int end){
        String str = s.substring(start,start+1);
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            str = s.substring(start,end+1);
            start--;
            end++;
        }
        return str;
    }

}
