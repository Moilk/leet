class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1)
            return s;
        final int STEP = (numRows - 1) * 2;
        char[] ans = new char[s.length()];
        int index = 0;

        for (int i = 0; i < numRows; i++) {
            int step = STEP - i * 2;
            step = step == 0 ? STEP : step;
            int j = i;

            while (j < ans.length) {
                ans[index++] = s.charAt(j);
                j += step;
                step = STEP == step ? STEP : STEP - step;
            }
        }

        return new String(ans);
    }
}