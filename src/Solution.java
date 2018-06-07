import java.util.Scanner;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder LongestSubString= new StringBuilder("");
        StringBuilder LongestSubString_temp = new StringBuilder("");
        for (int index=0;index<s.length();index++)
        {
            String indexChar = "" + s.charAt(index);
            if (LongestSubString_temp.indexOf(indexChar) != -1)
            { 
                if(!(LongestSubString.length() > LongestSubString_temp.length()))
            	{LongestSubString = LongestSubString_temp; }
            	CharSequence leftSubSequence = LongestSubString_temp.subSequence(LongestSubString_temp.indexOf(indexChar)+1, LongestSubString_temp.length());
                LongestSubString_temp = new StringBuilder();
                LongestSubString_temp.append(leftSubSequence);	
            }
            
            LongestSubString_temp.append(s.charAt(index));                
        }
        if(LongestSubString.length() < LongestSubString_temp.length())
         return LongestSubString_temp.length(); 
        else 
        	return LongestSubString.length();
    }

    
    public static void main(String[] args) {
    	Scanner cin = new Scanner(System.in);
    	Solution solution = new Solution();
    	System.out.println(solution.lengthOfLongestSubstring("ggububgvfk"));
    	}
    
}
