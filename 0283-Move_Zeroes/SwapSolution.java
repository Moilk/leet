public class SwapPassSolution {

	/**
	 * 遍历一遍数组，记录第一个0的位置，每次遇到非0的数就跟第一个0交换
	 */
	public void moveZeroes(int[] nums) {
		int zeroStart = -1;
		for (int i = 0; i< nums.length; i++) {
			if (nums[i] != 0 && zeroStart >= 0){
				swap(nums, i, zeroStart);
				zeroStart++;
			} else if(nums[i] == 0 && zeroStart < 0) {
				zeroStart = i;
			}
		}
    }

    private static void swap(int[] a, int i, int j) {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
}