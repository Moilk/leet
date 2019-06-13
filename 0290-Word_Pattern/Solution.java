import java.util.*;

/**
 * [单词规律]
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 * 
 * 方案: 用map保存单词到字母的映射，用set保存已存在的字母，避免不同单词映射到同一字母
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
  		String[] words = str.split(" ");      
  		char[] ps = pattern.toCharArray();

  		if(ps.length != words.length)	return false;

  		Map<String, Character> map = new HashMap<>();
  		Set<Character> set = new HashSet<>();
  		for(int i = 0; i < words.length; i++) {
  			if(!map.containsKey(words[i])){
  				if(set.contains(ps[i]))	return false;
  				map.put(words[i], ps[i]);
  				set.add(ps[i]);
  			} else if(map.get(words[i]) != ps[i]) {
  				return false;
  			}
  		}

  		return true;
    }
}