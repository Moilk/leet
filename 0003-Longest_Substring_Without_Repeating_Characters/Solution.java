/**
 * 滑动窗口
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int N = s.length();
    	int l = 0;
    	int r = 0;
    	// 保存字符出现的次数
    	int[] freq = new int[256];
    	int res = 0;

    	while(l<=r && r < N) {
    		if(freq[s.charAt(r)] <=0) {
    			freq[s.charAt(r++)]++;
    		} else {
    			freq[s.charAt(l++)]--;
    		}
    		res = Math.max(res, r - l);
    	}
        
        return res;
    }
}