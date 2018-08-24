class P26_RemoveDuplicates{
	public int removeDuplicates(int[] nums) {
		int i=0,j=0;
		while(i<nums.length)
		{
			if(nums[j]==nums[i])
				i++;
			else
				{j++;
				nums[j]= nums[i];
				i++;
			   }
		}
		return j+1;
	}
}