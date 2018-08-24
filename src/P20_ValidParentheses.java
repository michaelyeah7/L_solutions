import java.util.Stack;

class P20_ValidParentheses{
	public boolean isValid(String s) {
		Stack stack = new Stack<String>();
		int index=0;
		char charIndex;
		Object charPeek;
		while(index<s.length())
		{
		charIndex = s.charAt(index)	;
		if(stack.isEmpty())
			stack.push(charIndex);
		else 
			{
			if( (int)charIndex - (int)stack.peek().toString().charAt(0)<3 && (int)charIndex - (int)stack.peek().toString().charAt(0) >0)
			stack.pop();
			else stack.push(charIndex);}
	index++;
		}
		return stack.empty();
		
	}
    public static void main(String[] args) {
    	P20_ValidParentheses solution = new P20_ValidParentheses();
    	System.out.println(solution.isValid("([)]"));
    	}
}