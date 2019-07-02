import java.util.*;

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            dp[i] = i;
            for(int j = 1;; j++) {
                int a = i - j*j;
                if(a < 0)   break;
                dp[i] = Math.min(dp[i], dp[a] + 1);
            }
        }

        return dp[n];
    }
}