package two.pointers;

public class IsPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//complexity Time is O(n) & Space is O(1)
    public boolean isPalindrome(String s) {
        if(s == null)return false;
        if(s.length()<=1)return true;
        String str = s.replace("\\s","").toUpperCase();
        int left = 0; int right=str.length()-1;
        while(left<right){
            char leftC = str.charAt(left);
            char rightC = str.charAt(right);
            if(!Character.isLetterOrDigit(leftC))
                left++;
            else if(!Character.isLetterOrDigit(rightC))
                right--;
            else{
                if(leftC!=rightC)
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }

}
