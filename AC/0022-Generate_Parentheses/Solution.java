class Solution {
    private char[] buf;
    private List<String> ans;

    public List<String> generateParenthesis(int n) {
        buf = new char[2 * n];
        ans = new ArrayList<>();
        generateParenthesis(n, n);
        return ans;
    }

    private void generateParenthesis(int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(new String(buf));
        }
        if (left > 0) {
            buf[buf.length - left - right] = '(';
            generateParenthesis(left - 1, right);
        }
        if (left < right) {
            buf[buf.length - left - right] = ')';
            generateParenthesis(left, right - 1);
        }
    }
}