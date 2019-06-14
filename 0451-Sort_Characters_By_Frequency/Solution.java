import java.util.*;

/**
 * [根据字符串出现的频率排序]
 * 
 * 用map保存每个字母出现的频率，然后每次从里边找出频率最高的单词
 * 因为字母最多就58种，所以直接查找复杂度不算高
 */
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) +  1);
            } else {
                map.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()){
            char c ='\0';
            int max = 0;

            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if(v > max) {
                    max = v;
                    c = entry.getKey();
                }
            }
            map.remove(c);

            for(int i = 0; i < max; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}