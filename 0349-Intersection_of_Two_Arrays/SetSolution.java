import java.util.*;

/**
 * 考察Set的使用
 */
class SetSolution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> s1 = new HashSet<>();
    	Set<Integer> s2 = new HashSet<>();
    	for(int a: nums1)	s1.add(a);
    	for(int a: nums2) 	s2.add(a);
    	s1.retainAll(s2);

    	int[] res = new int[s1.size()];
    	int i = 0;
    	for(int a : s1) {
    		res[i++] = a;
    	}

    	return res;
    }
}