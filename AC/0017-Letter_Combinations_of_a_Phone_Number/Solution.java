class Solution {
    private static Map<Integer, String> map = new HashMap<>();
    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    private List<String> ans;
    private char[] str;

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return ans;
        }
        str = new char[digits.length()];

        letterCombinations(digits.toCharArray(), 0);

        return ans;
    }

    private void letterCombinations(char[] digits, int pos) {
        if (pos >= digits.length) {
            ans.add(new String(str));
            return;
        }

        for (char c : map.get(digits[pos] - '0').toCharArray()) {
            str[pos] = c;
            letterCombinations(digits, pos+1);
        }
    }
}