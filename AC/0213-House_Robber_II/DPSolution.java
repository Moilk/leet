class Solution {
    private int rob1(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        int[] dp = new int[n + 1];
        dp[1] = nums[0];
        for (int i =2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        
        return dp[n];
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int tmp = nums[0];
        nums[0] = 0;
        int res = rob1(nums);
        nums[0] = tmp;
        
        tmp = nums[n - 1];
        nums[n - 1] = 0;
        res = Math.max(res, rob1(nums));
        nums[n - 1] = tmp;
        
        return res;
    }
}