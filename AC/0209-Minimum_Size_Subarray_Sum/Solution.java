/**
 * 两点发 - 移动窗口
 * [start, cur] 定义一个移动窗口，
 * 首先，cur向右移动，使窗口总大小>=s，
 * 接着，start向右移动，是窗口<s，此时保存一下最小长度，然后重复操作
 */
public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		int start = 0;
		int cur = 0;
		int sum = 0;
		int res = nums.length;
		boolean hasRes = false;

		while (cur < nums.length) {
			sum += nums[cur];

			if (sum >= s) {
				hasRes = true;
				while (start <= cur && sum >= s) {
					sum -= nums[start++];
				}
				res = Math.min(res, cur - start + 2);
			}

			cur++;
		}

		return hasRes?res:0;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] testData = { 5, 1, 3, 5, 10, 7, 4, 9, 2, 8 };

		System.out.println(s.minSubArrayLen(15, testData));
	}
}

