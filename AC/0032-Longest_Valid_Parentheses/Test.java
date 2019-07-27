import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {
    	boolean[] f = new boolean[s.length()];
    	Deque<Integer> stack = new ArrayDeque<>();

    	int res = 0;

    	for(int i = 0; i < s.length(); i++){
    		char c = s.charAt(i);
    		if (c == '(') {
    			stack.addFirst(i);
    		} else {
    			if (!stack.isEmpty()){
    				f[stack.removeFirst()] = true;
    				f[i] = true;
    			}
    		}
    	}

    	int count = 0;
    	boolean last = false;
    	for (int i = 0; i < f.length; i++) {
    		if (f[i] == true){
    			count++;
    		} else if(last = true){
    			res = Math.max(res, count);
    			count = 0;
    		}
    		last = f[i];
    	}
    	System.out.println(Arrays.toString(f));

    	return Math.max(res, count);
    }
}

public class Test{
	public static void main(String[] args) {
		String[] ss = {
			"",
			"(",
			")",
			"()",
			"(()",
			")()())",
			")(()))())))(())()))())",
			"()(()"
		};

		Solution solution = new Solution();
		for(String s: ss){
			System.out.println(s + " => " + solution.longestValidParentheses(s));
		}
	}
}