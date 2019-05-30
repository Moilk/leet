public class Test{
	public static void main(String[] args) {
		int[][] nums1 = {
			{},
			{ 3 },
			{ 1, 3 }, 
			{ 1, 2 },
			{ 1, 4, 6, 8, 9 },
		};
	
		int[][] nums2 = {
			{ 1 },
			{ },
			{ 2 },
			{ 3, 4 },
			{ 0, 3, 4, 6, 7, 10, 11, 15 },
		};
	
		FastSolution solution = new FastSolution();
		for (int i = 0; i < Math.min(nums1.length, nums2.length); i++) {
			System.out.println(solution.findMedianSortedArrays(nums1[i], nums2[i]));
		}
	}
}