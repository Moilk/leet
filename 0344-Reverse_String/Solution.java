class Solution {
    public void reverseString(char[] s) {
 		int start = 0;
 		int end = s.length - 1;       

 		while(start < end) {
 			swap(s, start++, end--);
 		}
    }

    private static void swap(char[] s, int i, int j) {
    	char tmp = s[i];
    	s[i] = s[j];
    	s[j] = tmp;
    }
}