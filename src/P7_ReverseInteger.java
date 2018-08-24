class P7_ReverseInteger {
	public int reverse(int x) {
		int mod = 0;
		int reverse_temp = 0;
		while (x != 0) {
			mod = x % 10;
			reverse_temp = mod + reverse_temp * 10;
			if (reverse_temp > Integer.MAX_VALUE/10 || (reverse_temp == Integer.MAX_VALUE / 10 && mod > 7)) return 0;
            if (reverse_temp < Integer.MIN_VALUE/10 || (reverse_temp == Integer.MIN_VALUE / 10 && mod < -8)) return 0;
			x = (x-mod) / 10;
		}
		return reverse_temp;
	}

	public static void main(String[] args) {
		P7_ReverseInteger solution = new P7_ReverseInteger();
		System.out.println(solution.reverse(1534236469));
	}
}