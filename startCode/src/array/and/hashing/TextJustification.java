package array.and.hashing;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
		System.out.println(fullJustify(words,16));
		
	}
	public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> curWords = new ArrayList<>();
        int curLen = 0;
        for(String word : words){
            if(curLen+curWords.size()+word.length()>maxWidth){
                int gaps = curWords.size()-1;
                int spaceRequired = maxWidth-curLen;
                if(gaps==0)
                    res.add(curWords.get(0)+" ".repeat(spaceRequired));
                else{
                    int gapPerWord = spaceRequired/gaps;
                    int extraSpaces = spaceRequired%gaps;
                    StringBuilder line = new StringBuilder();
                    for(int i=0;i<curWords.size();i++){
                        line.append(curWords.get(i));
                        if(i<gaps){
                        line.append(" ".repeat(gapPerWord));
                            if(i<extraSpaces)
                                line.append(" ");
                        }
                    }
                    res.add(line.toString());
                }
                curLen = 0;
                curWords.clear();
            }
            curWords.add(word);
            curLen += word.length();
        }
        StringBuilder lastline = new StringBuilder(String.join(" ",curWords));
        while(lastline.length()<maxWidth)
            lastline.append(' ');
        res.add(lastline.toString());
        return res;
    }

}
