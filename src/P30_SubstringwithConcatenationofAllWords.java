import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P30_SubstringwithConcatenationofAllWords {
	public List<Integer> findSubstring(String s, String[] words) {
		String anchor = words[0];
		String checkString = new String();
		int wordLength = anchor.length();
		ArrayList anchorsIndex = new ArrayList(), checkedString = new ArrayList();
		int fromIndex = 0, i = 0, beginIndex = 0;
		boolean keepChecking = true, goingForward = true;
		ArrayList findSubstring = new ArrayList();
		// find all anchors' index
		while (s.indexOf(anchor, fromIndex) != -1) {
			fromIndex = s.indexOf(anchor, fromIndex);
			anchorsIndex.add(fromIndex);
			fromIndex++;
		}
		// check every anchor
		for (i = 0; i < anchorsIndex.size(); i++) {
			beginIndex = (int) anchorsIndex.get(i);
			keepChecking = true;
			checkedString.clear();
			goingForward = true;
			while (keepChecking == true) {
				checkString = s.substring(beginIndex, beginIndex + wordLength);
				if (goingForward == true) {
					if (Arrays.asList(words).contains(checkString) == true
							&& checkedString.contains(checkString) == false) {
						beginIndex += wordLength;
						checkedString.add(checkString);
						if (beginIndex > s.length() || (beginIndex + wordLength) > s.length()) {
							goingForward = false;
							beginIndex = (int) anchorsIndex.get(i) - wordLength;
						}
					} else {
						goingForward = false;
						beginIndex = (int) anchorsIndex.get(i) - wordLength;
					}
				}

				else {
					if (Arrays.asList(words).contains(checkString) == true
							&& checkedString.contains(checkString) == false) {
						beginIndex -= wordLength;
						checkedString.add(checkString);
						if (beginIndex < 0) {
							keepChecking = false;
							if (checkedString.size() == words.length)
								findSubstring.add(beginIndex + wordLength);
						}
					} else {
						keepChecking = false;
						if (checkedString.size() == words.length)
							findSubstring.add(beginIndex + wordLength);
					}
				}

			}
		}
		return findSubstring;

	}

	public static void main(String[] args) {
		P30_SubstringwithConcatenationofAllWords solution = new P30_SubstringwithConcatenationofAllWords();
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		System.out.println(solution.findSubstring(s, words));
	}
}