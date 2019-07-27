/**
 * 判断一个字符串是否为另一个字符串的"变位词"
 *
 * 方案：数组计数器
 *     > 存在Unicode时无效
 */
class ArrayCountersSolution {
	int[] asciiCount = new int[256];

    public boolean isAnagram(String s, String t) {
    	int missing = t.length();
        for(char c : t.toCharArray()) {
        	asciiCount[c]++;
        }

        for(char c : s.toCharArray()) {
        	if(asciiCount[c] > 0) {
        		missing--;
        		asciiCount[c]--;
        	} else {
        		return false;
        	}
        }

        return missing==0;
    }

    public static void main(String[] args) {
    	ArrayCountersSolution s = new ArrayCountersSolution();
    	System.out.println(s.isAnagram("anagram", "nagaram"));
    }
}