class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        
        for (int i = 2; i <= n; i++) {
            int count = 0;
            if (s.charAt(i - 2) == '0') {
                if (s.charAt(i - 1) != '0') count = dp[i - 1];
            } else {
                int num = Integer.parseInt(s.substring(i - 2, i));
                if (num <= 26) {
                    count += dp[i - 2];
                }
                if (s.charAt(i - 1) != '0') {
                    count += dp[i - 1];
                }
            }
            dp[i] = count;
        }
        
        return dp[n];
    }
}