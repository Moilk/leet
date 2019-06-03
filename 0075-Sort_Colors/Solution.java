/*
 * 三向切分partition 
 */
class Solution {
    public void sortColors(int[] nums) {
    	int N = nums.length;
        int lf = 0, i = 0, rg = N - 1;

        while(i <= rg) {
        	if(nums[i] < 1) {
        		swap(nums, lf++, i++);
        	} else if(nums[i] > 1) {
        		swap(nums, rg--, i);
        	} else {
        		i++;
        	}
        }
    }

    private static void swap(int[] nums, int i, int j) {
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
}