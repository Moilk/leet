class Solution {
    public String longestPalindrome(String s) {
        int N = s.length();
        char[] c = s.toCharArray();
        String res = "";

        for (int i = 0; i < N; i++) {
            int start = i;
            int end = i;
            while (start >= 0 && end < N) {
                if (c[start] != c[end]) {
                    break;
                }
                start--;
                end++;
            }
            if (end - start - 1 > res.length()) {
                res = s.substring(start + 1, end);
            }
        }

        for (int i = 0; i < N - 1; i++) {
            if (c[i] != c[i + 1]) {
                continue;
            }
            int start = i;
            int end = i + 1;
            while (start >= 0 && end < N) {
                if (c[start] != c[end]) {
                    break;
                }
                start--;
                end++;
            }
            if (end - start - 1 > res.length()) {
                res = s.substring(start + 1, end);
            }
        }

        return res;
    }
}

public class LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input = { "babad", "cbbd", "a", "" };
        for (String s : input) {
            System.out.println(solution.longestPalindrome(s));
        }
    }
}