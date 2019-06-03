class Solution {
    public boolean isPalindrome(String s) {
    	int start = 0;
    	int end = s.length() - 1;
        
        while(start < end) {
        	char c1 = lower(s.charAt(start));
        	char c2 = lower(s.charAt(end));

        	if(!isValid(c1)) {
        		start++;
        		continue;
        	}
        	if(!isValid(c2)) {
        		end--;
        		continue;
        	}

        	if(c1 == c2) {
        		start++;
        		end--;
        	} else {
        		return false;
        	}
        }

        return true;
    }

    private static char lower(char c) {
    	if(c>='A' && c<='Z'){
    		c+=32;
    	}
    	return c;
    }

    private static boolean isValid(char c) {
    	return (c>='a' && c<='z') || (c >= '0' && c<='9');
    }
}