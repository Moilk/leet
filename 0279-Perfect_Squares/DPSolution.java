import java.util.*;

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = i;
            for(int j = 1; ; j++) {
                int p = i - j * j;
                if( p < 0 ) break;
                if( p == 0 ) {
                    dp[i] = 1;
                    break;
                }
                dp[i] = Math.min(dp[i], dp[p] + 1);
            }
        }

        return dp[n];
    }
}