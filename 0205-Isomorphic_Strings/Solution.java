import java.util.*;

/**
 * [同构字符串]
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 方案：与290类似，用一个map保存单词的映射关系，再用一个set保证是一一映射
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
    	if(s.length() != t.length())	return false;

    	Map<Character, Character> map = new HashMap<>();
    	Set<Character> set = new HashSet<>();

    	for(int i = 0; i < s.length(); i++) {
    		char c1 = s.charAt(i);
    		char c2 = t.charAt(i);
    		if(!map.containsKey(c1)) {
    			if(set.contains(c2))	return false;
    			map.put(c1, c2);
    			set.add(c2);
    		} else if(map.get(c1) != c2) {
    			return false;
    		}
    	}

    	return true;
    }
}
