
public class P5_LongestPalindrome {
	public String longestPalindrome(String s) {
		int index = 0;
		StringBuilder checkedCharacters = new StringBuilder("");
		String LPS = new String();
		String cLPS = new String();
		for (index = 0; index < s.length(); index++) {
			String char_index = String.valueOf(s.charAt(index));
			if (checkedCharacters.indexOf(char_index) != -1)
				break;
			else {
				int firstIndex = s.indexOf(char_index);
				int secondIndex = s.indexOf(char_index);
				if (s.indexOf(char_index, firstIndex + 1) == -1)
					cLPS = char_index;
				else {
					while (s.indexOf(char_index, secondIndex + 1) != -1) {
						secondIndex = s.indexOf(char_index, secondIndex + 1);
					}
					String cLPS_temp = s.substring(firstIndex, secondIndex + 1);
					if (cLPS_temp.length() > cLPS.length())
						cLPS = cLPS_temp;
					checkedCharacters.append(char_index);
				}
			}
			if (cLPS.length() > LPS.length())
				LPS = cLPS;
		}
		return LPS;
	}

	public static void main(String[] args) {
		P5_LongestPalindrome solution = new P5_LongestPalindrome();
		System.out.println(solution.longestPalindrome("ccc"));
	}

}
