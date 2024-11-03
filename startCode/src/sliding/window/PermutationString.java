package sliding.window;

import java.util.Arrays;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Time - n Space - 1 :)
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int index=0;index<s1.length();index++){
            arr1[s1.charAt(index)-'a']++;
            arr2[s2.charAt(index)-'a']++;
        }
        for(int index = s1.length();!Arrays.equals(arr1,arr2);index++){
            if(index==s2.length())return false;
            arr2[s2.charAt(index-s1.length())-'a']--;
            arr2[s2.charAt(index)-'a']++;
        }
        return true;
    }

}
