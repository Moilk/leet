
/*
 * [0,0,1,1,1,1,2,3,3] => [0, 0, 1, 1, 2, 3, 3]
 */
class Solution {
    public int removeDuplicates(int[] nums) {
    	if(nums.length == 0) {
    		return 0;
    	}

 		int last = 0;
 		int count = 1;

 		for(int i = 1; i < nums.length; i++) {
 			if(nums[i] != nums[last]) {
 				nums[++last] = nums[i];
 				count = 1;
 			} else if(count<2) {
 				nums[++last] = nums[i];
 				count++;
 			}
 		}

 		return last+1;
    }
}