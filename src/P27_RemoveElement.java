class P27_RemoveElement {
	public int removeElement(int[] nums, int val) {
		int i = 0, j = 1,iLast =0;
		while (j < nums.length) {
			if (nums[i] == val) {

				if (nums[j] != val) {
					swap(nums, i, j);
					iLast =i;
					i++;
					j++;
				} else
					j++;
			} else {
				i++;
				j++;
			}
		}
		return iLast+1;
	}

	public void swap(int[] nums, int i, int j) {
		int temp;
		temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		P27_RemoveElement solution = new P27_RemoveElement();
		int[] nums = { 0,1,2,2,3,0,4,2 };
		System.out.println(solution.removeElement(nums, 2));
	}

}
