import java.util.*;

class Solution {
	static Set<Character> vowels = new HashSet<Character>(){
		{
			add('a');
			add('e');
			add('i');
			add('o');
			add('u');
		}
	};

    public String reverseVowels(String s) {
    	char[] cc = new char[s.length()];

    	int start = 0;
    	int end = s.length() - 1;

        while(start <= end ) {
        	char c1 = s.charAt(start);
        	if(!isVowels(c1)) {
        		cc[start++] = c1;
        		continue;
        	}  

        	char c2 = s.charAt(end);
        	if(!isVowels(c2)){
        		cc[end--] = c2; 
        		continue;
        	}

        	cc[start++] = c2;
        	cc[end--] = c1;
        }

        return  new String(cc);
    }
    private static boolean isVowels(char c) {
    	return vowels.contains(lower(c));
    }

    private static char lower(char c) {
    	if(c>='A'&&c<='Z'){
    		c += 32;
    	}
    	return c;
    }
}