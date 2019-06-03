/**
 * 遍历一遍，把每次非0的数直接写到它对应的位置上，
 * 然后遍历第二遍，把剩下的位置填0
 */
public class TestSolution {
	public void moveZeroes(int[] nums) {
		int s = -1;

		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				nums[++s] = nums[i];
			}
		}

		for(int i=s+1; i<nums.length; i++) {
			nums[i] = 0;
		}
	}
}