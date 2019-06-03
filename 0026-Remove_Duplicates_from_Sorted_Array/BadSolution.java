/**
 * 忽略了数组是有序的
 */
class BadSolution {
    public int removeDuplicates(int[] nums) {
        int size = 0;

        for(int i = 0; i < nums.length; i++) {
        	boolean existed = false;
        	for(int j = 0; j < size; j++) {
        		if(nums[i] == nums[j]) {
        			existed = true;
        			break;
        		}
        	}

        	if(!existed) {
        		nums[size++] = nums[i];
        	}
        }

        return size;
    }
}