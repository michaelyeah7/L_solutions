
public class P4_MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double m = (nums1.length + nums2.length +1)/2 ;
	       double stopIndexd = Math.ceil(m);
	        int stopIndex = (int) stopIndexd;
	        int nums1Index, nums2Index, Aindex = 0;
	        int[] A;
	        double Median;
	        while ( Aindex < stopIndex)
	        {
	            if(nums1[nums1Index]<nums2[nums2Index]||nums2[nums2Index]==0)
	            {A[Aindex] = nums1[nums1Index];
	                nums1Index++;}
	            else 
	            {A[Aindex] = nums2[nums2Index];
	                nums2Index++;}
	            Aindex++;
	            
	        }
	        if((nums1.length + nums2.length +1)%2 ==1)
	            Median = A[stopIndex-1];
	        else
	            Median = (A[stopIndex-2]+A[stopIndex-1])/2;
	    
	        return Median;
	    }
    public static void main(String[] args) {
    	P4_MedianofTwoSortedArrays solution = new P4_MedianofTwoSortedArrays();
    	System.out.println(solution.findMedianSortedArrays("ggububgvfk"));
    	}
}
