package array.and.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEncodeAndDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String encode(List<String> strs) {
        if(strs.size()==0)return null;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(new StringBuilder(strs.get(i)));
            if(i<strs.size()-1){
                sb.append(":-:");
            }
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> original = new ArrayList();
        if(str==null)return original;
        if(str == null) return null;
        String[] s = str.split(":-:");
        original = Arrays.asList(s);
        return original;
    }

}
