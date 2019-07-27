import java.util.*;
/**
 * 快速排序思路
 */
class FastSortSolution {
    public int findKthLargest(int[] nums, int k) {
    	k = nums.length - k;
    	quickSelect(nums, 0, nums.length - 1, k);
    	return nums[k];
    }

    private static void quickSelect(int[] nums, int lo, int hi, int k) {
    	Random rand = new Random();
    	swap(nums, lo, lo + rand.nextInt(hi - lo + 1));

    	int v = nums[lo];
    	int lf = lo, i = lo + 1, rg = hi;
		while(i <= rg){
    		if(nums[i] > v) {
    			swap(nums, rg--, i);
    		} else if(nums[i] < v) {
    			swap(nums, lf++, i++);
    		} else {
    			i++;
    		}
    	}
    	if(k < lf ) {
    		quickSelect(nums, lo, lf - 1, k);
    	} else if(k > rg){
    		quickSelect(nums, rg + 1, hi, k);
    	}
    }

 	private static void swap(int[] a, int i, int j) {
    	int tmp = a[i];
    	a[i] = a[j];
    	a[j] = tmp;
    }
}