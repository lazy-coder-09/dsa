package dynamic.programming1;

public class PalindromicSubstringsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countSubstrings(String s) {
        int len = s.length();
        if(len<=1) return s.length();
        int count = 1;
        for(int i=0;i<len-1;i++){
            count+=checkPalindrome(s,i,i);
            count+=checkPalindrome(s,i,i+1);
        }
        return count;
    }
    public int checkPalindrome(String s, int i, int j){
        //String str = s.substring(i,i+1);
        int count = 0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            //str = s.substring(i,j+1);
            i--;
            j++;
        }
        return count;
    }

}
