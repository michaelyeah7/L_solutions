import java.util.ArrayList;
import java.util.List;
class P22_GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> list1 = new ArrayList<String>();
		list1.add("");
		List<String> listOperater = new ArrayList<String>();
		int count = 0;
		while (count < n) {
			for (String string : list1) {
				listOperater = generateString(string, listOperater);
			}
			list1.clear() ;
			list1.addAll(listOperater);
			listOperater.clear();
			count++;
		}
		return list1;

	}

	public List<String> generateString(String string, List<String> list2) {
		StringBuilder stringInput = new StringBuilder(string);
		StringBuilder stringToAdd = new StringBuilder();
		StringBuilder stringParenthesis = new StringBuilder("()");
		StringBuilder stringParenthesisleft = new StringBuilder("(");
		// add at the right side
		stringToAdd = stringInput.append("()");
		if (!(list2.contains(stringToAdd.toString())))
			list2.add(stringToAdd.toString());
		// add at the left side
		stringToAdd = stringParenthesis.append(string);
		if (!(list2.contains(stringToAdd.toString())))
			list2.add(stringToAdd.toString());
		// enclose
		stringToAdd = stringParenthesisleft.append(string).append(")");
		if (!(list2.contains(stringToAdd.toString())))
			list2.add(stringToAdd.toString());
		
		return list2;
	}
	
    public static void main(String[] args) {
    	P22_GenerateParenthesis solution = new P22_GenerateParenthesis();
    	System.out.println(solution.generateParenthesis(4));
    	}
}