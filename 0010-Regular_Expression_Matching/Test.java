class Solution {
    public boolean isMatch(String s, String p) {
    	if(p.isEmpty()){
    		return s.isEmpty();
    	}

    	boolean firstMatch = (!s.isEmpty())&&((p.charAt(0) == '.')|| (p.charAt(0) == s.charAt(0)));

    	if(p.length() >= 2 && p.charAt(1) == '*'){
    		return (firstMatch && isMatch(s.substring(1), p)) || isMatch(s, p.substring(2));
    	}

    	return firstMatch && isMatch(s.substring(1), p.substring(1));
    }
}

public class Test{
	public static void main(String[] args) {
		String[] ss = {
			"aa",
			"aa",
			"ab",
			"aab",
			"mississippi",

		};
		String[] pp = {
			"a",
			"a*",
			".*",
			"c*a*b",
			"mis*is*p*.",

		};

		for(int i=0; i<ss.length; i++){
			System.out.println(ss[i]+" | "+ pp[i] +" => "+new Solution().isMatch(ss[i], pp[i]));
		}
	}
}