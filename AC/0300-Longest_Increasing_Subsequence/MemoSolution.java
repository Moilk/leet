/**
 * 递归 + 记忆化搜索
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] memo = new int[nums.length + 1][nums.length];
        for (int i = 0; i <= nums.length; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        return lengthOfLIS(nums, -1, 0, memo);
    }
    
    public int lengthOfLIS(int[] nums, int lastIndex, int index, int[][] memo) {
        if (index == nums.length) return 0;
        
        if (memo[lastIndex + 1][index] >= 0) {
            return memo[lastIndex + 1][index];
        }
        
        int taken = 0;
        if (lastIndex <0 || nums[index] > nums[lastIndex]) {
            taken = 1 + lengthOfLIS(nums, index, index + 1, memo);
        }
        int notTaken = lengthOfLIS(nums, lastIndex, index + 1, memo);
        
        memo[lastIndex + 1][index] = Math.max(taken, notTaken);
        return memo[lastIndex + 1][index];
    }
}