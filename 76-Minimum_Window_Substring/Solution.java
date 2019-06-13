import java.util.*;

class Solution {
	int[] asciiCount = new int[256];

	public String minWindow(String s, String t) {
		for (char c : t.toCharArray()) {
			asciiCount[c]++;
		}

		int index = 0;
		int minLen = Integer.MAX_VALUE;
		char[] S = s.toCharArray();
		int l = 0, r = 0;
		int left = t.length();

		while (r < S.length) {
			if (asciiCount[S[r]] > 0) {
				left--;
			}
			asciiCount[S[r]]--;
			r++;

			if (left == 0) {
				while (asciiCount[S[l]] < 0) {
					asciiCount[S[l]]++;
					l++;
				}
				int len = r - l;
				if (len < minLen) {
					minLen = len;
					index = l;
				}
			}
		}

		if (minLen == Integer.MAX_VALUE)
			return "";
		return s.substring(index, index + minLen);
	}

	public static void main(String[] args) {
		String S = "ADOBECODEBANC";
		String T = "ABC";

		Solution s = new Solution();

		System.out.println(s.minWindow(S, T));
	}
}