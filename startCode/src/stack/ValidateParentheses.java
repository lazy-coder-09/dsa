package stack;

import java.util.Stack;

public class ValidateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty())
                    return false;
                else if(ch=='}' && stack.peek()!='{')
                    return false;
                else if(ch==']' && stack.peek()!='[')
                    return false;
                else if(ch==')' && stack.peek()!='(')
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
