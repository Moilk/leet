public class FastSolution {

	public double findMedianSortedArrays(int[] A, int[] B) {
		if(A.length > B.length) {
			int[] tmp = A;
			A = B;
			B = tmp;
		}

		int m = A.length;
		int n = B.length;

		int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
		while (iMin <= iMax) {
			int i =  iMin + (iMax - iMin) / 2;
			int j = halfLen - i;

			if (B[j - 1] > A[i]) {
				iMin = i + 1;
			} else if (A[i - 1] > B[j]) {
				iMax = i - 1;
			} else {
				
			}

		}

		return 0.0;
	}
}