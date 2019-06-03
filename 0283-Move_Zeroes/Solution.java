import java.util.*;

/**
 * 从末尾开始找0，找到0就用冒泡法挪到后面去
 * 算法复杂度为O(n^2)
 */
public class BubbleSolution {
	public void moveZeroes(int[] nums) {
		int z = nums.length;

		for(int k = nums.length-1; k>=0; k--) {
			if(nums[k] == 0) {
				z--;
				for(int i = k; i < z; i++) {
					swap(nums, i, i+1);
				}
			}
		}
    }

    private static void swap(int[] a, int i, int j) {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
}