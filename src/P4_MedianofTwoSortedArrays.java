import java.util.ArrayList;

public class P4_MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double m = (nums1.length + nums2.length + 1) / 2.0;
		int stopIndex = (int) Math.ceil(m);

		int nums1Index = 0;
		int nums2Index = 0;
		int Aindex = 0;
		ArrayList A = new ArrayList();
		double Median;
		while (Aindex < stopIndex) {
			if (!(nums1Index < nums1.length)) {
				A.add(Aindex, nums2[nums2Index]);
				nums2Index++;
			} else if (!(nums2Index < nums2.length)) {
				A.add(Aindex, nums1[nums1Index]);
				nums1Index++;
			}

			else if (nums1[nums1Index] < nums2[nums2Index]) {
				A.add(Aindex, nums1[nums1Index]);
				nums1Index++;
			} else {
				A.add(Aindex, nums2[nums2Index]);
				nums2Index++;
			}
			Aindex++;

		}
		Integer[] array = new Integer[A.size()];
		A.toArray(array);
		if ((nums1.length + nums2.length + 1) % 2 == 1)
			Median = (array[stopIndex - 2] + array[stopIndex - 1]) / 2.0;
		else
			Median = array[stopIndex - 1];

		return Median;
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2 };
		int nums2[] = { 3, 4 };
		P4_MedianofTwoSortedArrays solution = new P4_MedianofTwoSortedArrays();
		System.out.println(solution.findMedianSortedArrays(nums1, nums2));
	}
}
