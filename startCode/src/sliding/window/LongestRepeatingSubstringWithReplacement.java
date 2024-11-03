package sliding.window;

public class LongestRepeatingSubstringWithReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l=0;
        int result = 0;
        int maxRepeatCharCount=0; 
        for(int i=0;i<s.length();i++){
            char r = s.charAt(i);
            maxRepeatCharCount=Math.max(maxRepeatCharCount,++arr[r-'A']);
            if(i-l+1-maxRepeatCharCount>k){
                char c = s.charAt(l);
                arr[c-'A']--;
                l++;
            }
            result = Math.max(result,i-l+1);
        }
        return result;
    }

}
