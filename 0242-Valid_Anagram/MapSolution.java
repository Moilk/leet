import java.util.*;

/**
 * 判断一个字符串是否为另一个字符串的"变位词" 
 * 
 * 方案: 使用map做计数器,速度不高
 */
class MapSolution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;

        Map<Character, Integer> charCount = new HashMap<>();

        for(char c : t.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for(char c : s.toCharArray()) {
            if(charCount.containsKey(c) && charCount.get(c) > 0){
                charCount.put(c, charCount.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        MapSolution s = new MapSolution();

        System.out.println(s.isAnagram("齉龘靐齉齾멋", "齾龘멋靐齉齉"));
    }
}