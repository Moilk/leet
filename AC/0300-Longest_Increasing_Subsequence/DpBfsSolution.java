/**
 * 动态规划 + 二分搜索
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int pos = Arrays.binarySearch(dp, 0, len, num);
            if (pos < 0) {
                pos = -(pos + 1);
            }
            dp[pos] = num;
            if (pos == len) {
                len++;
            }
        }
        
        return len;
    }
}