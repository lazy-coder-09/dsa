package sliding.window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Time C = O(n) Space = O(min(n,m))
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res =0;
        Set<Character> set = new HashSet<>();
        for(int r =0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r-l+1);
        }
        return res;
    }

}
