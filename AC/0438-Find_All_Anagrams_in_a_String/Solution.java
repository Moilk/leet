import java.util.*;

/**
 * 滑动窗口+数组计数器
 * 
 * 如果计数比0大就右侧往右移动，同时计数减一
 * 否则，左侧往右移动，同时计数加一，
 * 当窗口长度达到条件时，窗口内的元素自然也达到了条件
 */
class Solution {
	int[] asciiCount = new int[256];

    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> res = new ArrayList<>();

    	int sLen = s.length();
    	int pLen = p.length();

    	for(int i = 0; i < pLen; i++) {
    		asciiCount[p.charAt(i)]++;
    	}

    	int l = 0, r = 0;

    	while(r < sLen) {
    		char c = s.charAt(r);
    		if(asciiCount[c] > 0) {
    			r++;
    			asciiCount[c]--;
    			if((r - l) == pLen)	res.add(l);
    		} else {
    			asciiCount[s.charAt(l++)]++;
    		}
    	}

        
        return res;
    }

    public static void main(String args[]) {
    	Solution s = new Solution();
    	System.out.println(s.findAnagrams("abccdcdcdcdcdccdba", "ab"));
    }
}