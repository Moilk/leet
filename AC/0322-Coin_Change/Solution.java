class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            int tmp;
            for (int j = 0; j < coins.length; j++) {
                if ((tmp = i - coins[j]) >=0 && dp[tmp] < amount) {
                    dp[i] = Math.min(dp[i], dp[tmp] + 1);
                }
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount] ;
    }
}