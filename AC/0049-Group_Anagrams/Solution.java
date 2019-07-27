import java.util.*;

/**
 * [字母异位词分组]
 * 
 * 方案：遍历所有字符串，统计每个字符串单词出现的次数，用一个长度为26的数字串表示
 *      建一个map，[数字串 -> 该字母异位词在list中的地址]
 * 关键在于找到一种高效的方式，能对字符串hash，保证字母异位词的hash结果是一样的
 * 这里使用的hash方式并不高效
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>(strs.length);
        Map<String, Integer> map = new HashMap<>();
        int index = 0;

        for(String s : strs) {
            int[] a = new int[26];
            for(int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - 'a']++;
            }
            String tmp = Arrays.toString(a);
            if(map.containsKey(tmp)) {
                res.get(map.get(tmp)).add(s);
            } else {
                map.put(tmp, index++);
                List<String> l = new LinkedList<String>();
                l.add(s);
                res.add(l);
            }
        }


        return res;
    }
}