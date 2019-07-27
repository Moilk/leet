class Solution {
    public String longestCommonPrefix(String[] strs) {
    	return logestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String logestCommonPrefix(String[] strs, int s, int e) {
    	if(s < 0 || e < 0)	return "";
    	if(s > e)	return strs[e];
    	if(s == e) return strs[s];
    	int mid = s + (e - s) / 2;
    	String s1 = logestCommonPrefix(strs, s, mid);
    	String s2 = logestCommonPrefix(strs, mid + 1, e);

    	int n = Math.min(s1.length(), s2.length());
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < n; i++) {
    		char c = s1.charAt(i);
    		if(c == s2.charAt(i)) {
    			sb.append(c);
    		} else {
    			break;
    		}
    	}
    	return sb.toString();
    }

    public static void main(String[] args) {
    	Solution s = new Solution();

    	String[] testData = {
    	};

    	System.out.println(s.longestCommonPrefix(testData));
    }
}