import java.util.*;

class Solution {

    public String minWindow(String s, String t) {
    	Map<Character, Integer> charCount = new HashMap<>();

    	for(int i = 0; i < t.length(); i++) {
    		char c = t.charAt(i);
    		if(!charCount.containsKey(c)){
    			charCount.put(c, 1);
    		}else{
    			charCount.put(c, charCount.get(c) + 1);
    		}
    	}

    	int index = 0;
    	int minLen = Integer.MAX_VALUE;
    	int count = 0;
    	int l = 0, r = 0;

    	while(r < s.length()) {
    		char c = s.charAt(r);
    		if(charCount.containsKey(c)){
    			int  tmp = charCount.get(c);
    			if(tmp > 0) {
    				charCount.put(c, tmp - 1);
    				count++;
    				r++;
    				if(count == t.length()) {
    					while(!charCount.containsKey(s.charAt(l)))	l++;
    					int len = r - l;
    					if(len < minLen) {
    						minLen = len;
    						index = l;
    						if(minLen == t.length()){
    							break;
    						}
    					}
    				}
    			} else {
    				c = s.charAt(l);
    				if(charCount.containsKey(c)){
    					charCount.put(c, charCount.get(c) + 1);
    					count--;
    				}
    				l++;
    			}

    		} else {
    			r++;
    		}

		}
		
		if(minLen == Integer.MAX_VALUE)	return "";

    	return s.substring(index, index + minLen);	
    }

    public static void main(String[] args) {
    	String S = "a";
    	String T = "aa";

    	Solution s = new Solution();

    	System.out.println(s.minWindow(S, T));
    }
}