class Solution {
    private static final int MOD = 1000000007;

    static int checkRecord(int n) {
        long[] dpP = new long[n + 5];   // 以P结尾且序列中不存在L
        long[] dpA = new long[n + 5];   // 以A结尾且序列总不存在L
        long[] dpLP = new long[n + 5];  // 以P结尾且序列中存在一个L
        long[] dpLA = new long[n + 5];  // 以A结尾且序列中存在一个L

        dpP[0] = 1;
        dpA[0] = 0;
        dpP[1] = 1;
        dpA[1] = 1;

        for (int i = 2; i <= n; i++) {
            dpP[i] = (dpP[i - 1] + dpA[i - 1]) % MOD;
            dpA[i] = (dpP[i - 1] + dpP[i - 2]) % MOD;
            dpLP[i] = (dpP[i - 2] + dpA[i - 2] + dpLP[i - 1] + dpLA[i - 1]) % MOD;
            dpLA[i] = (dpP[i - 2] + dpA[i - 2] + dpLP[i - 1] + dpLP[i - 2]) % MOD;
            if (i > 2) {
                dpLA[i] = (dpLA[i] + dpP[i - 3] + dpA[i - 3]) % MOD;
            }
        }

        return (int)((dpLP[n] + dpLA[n] + dpP[n] + dpA[n] + dpP[n - 1] + dpA[n - 1]) % MOD);
    }
}