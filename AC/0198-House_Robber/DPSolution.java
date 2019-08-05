class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[n];
    }
}