import java.util.*;

/**
 * 求两个数组的交集(元素可以重复)
 *
 * 使用map计数器
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    	Map<Integer, Integer> n2 = new HashMap<>();

    	for(int a: nums2) {
    		if(n2.containsKey(a)){
    			n2.put(a, n2.get(a) + 1);
    		} else {
    			n2.put(a, 1);
    		}
    	}

    	List<Integer> r = new ArrayList<>();
    	for(int a: nums1){
    		if(n2.containsKey(a) && n2.get(a) > 0) {
    			r.add(a);
    			n2.put(a, n2.get(a) - 1);
    		}
    	}

    	int[] res = new int[r.size()];
    	int i = 0;
    	for(int a : r) {
    		res[i++] = a;
    	}

    	return res;
    }
}