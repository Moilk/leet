import java.util.*;

class Solution {
	static int[] asciiCount = new int[256];

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
    	System.out.println(s.findAnagrams("abba", "ab"));
    }
}