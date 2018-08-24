public class P6_ZigZagConversion {
	public String convert(String s, int numRows) {
		StringBuilder converts= new StringBuilder("");
		int l = s.length();
		char[][] Zmatrix = new char[numRows][l];
		int index = 0, i = 0, j = 0, numColumn = 0;
		boolean flag = true;
		char selectedChar;

        if(numRows==1)
        {
            return s;
        }
		while (index < s.length()) {
			if (i == numRows-1)
				flag = false;
			if (i == 0)
				flag = true;
			selectedChar = s.charAt(index);
			Zmatrix[i][j] = selectedChar;
			index++;
			if (flag == true)
				i++;
			else {
				i--;
				j++;
			}

		}
		numColumn = j+1;
		for(i=0;i<numRows;i++) {
			for(j=0;j<numColumn;j++)
			{ selectedChar = Zmatrix[i][j];
				if ( selectedChar != 0 )
					{converts.append(Zmatrix[i][j]);}					
			}}
		return converts.toString();
	}
	
    public static void main(String[] args) {
    	P6_ZigZagConversion solution = new P6_ZigZagConversion();
    	String s = "PAYPALISHIRING";
    	int numRows = 3;
    	System.out.println(solution.convert(s,numRows));
    
    }
}