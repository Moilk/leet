class Solution {
    public int myAtoi(String str) {
        long ans = 0;
        boolean neg = false;
        int index = 0;

        // 跳过前导空格
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        // 读取 -/+ 号
        if (index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')) {
            neg = str.charAt(index) == '-';
            index++;
        }

        // 读取连续数字
        while (index < str.length()) {
            char c = str.charAt(index++);
            // 遇到非数字退出
            if  (c < '0' || c > '9') {
                break;
            }
            ans = ans * 10 + c - '0';
            // 溢出
            if (ans + Integer.MIN_VALUE > 0) break;
        }

        if (neg) ans = -ans;
        if (ans < Integer.MIN_VALUE) ans = Integer.MIN_VALUE;
        if (ans > Integer.MAX_VALUE) ans = Integer.MAX_VALUE;

        return (int)ans;
    }
}