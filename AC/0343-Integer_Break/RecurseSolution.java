// 递归 + 记忆化搜索
class Solution {
    private int[] memo;
    
    private int breakInteger(int n) {
        if (memo[n] != -1) {
            return memo[n];
        }
        int res = -1;
        for (int i = 1; i <= n / 2; i++) {
            res = Math.max(res, Math.max(i, breakInteger(i)) * Math.max(n - i, breakInteger(n- i)));
        }
        memo[n] = res;
        return res;
    }
    
    public int integerBreak(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[1] = 1;
        return breakInteger(n);
    }
}