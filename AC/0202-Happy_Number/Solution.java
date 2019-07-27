import java.util.*;

/**
 * 快乐数
 */
class Solution {
    public boolean isHappy(int n) {
    	Set<Integer> set = new HashSet<>();

    	while(true) {
    		if(n == 1)	return true;
    		if(set.contains(n))	return false;
    		set.add(n);
    		n = nextHappy(n);
    	}
    }

    public static int nextHappy(int n) {
    	int res = 0;

    	String s = String.valueOf(n);

    	for(int i = 0; i < s.length(); i++) {
    		int a = s.charAt(i) - '0';
    		res += a * a;
    	}

    	return res;
    }

    public static void main(String[] args) {
    	Solution s = new Solution();

    	System.out.println(s.isHappy(19));
    }
}