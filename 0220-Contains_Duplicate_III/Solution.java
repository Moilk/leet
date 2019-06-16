import java.util.*;

/**
 * [存在重复元素 III]
 * 
 * 方案：遍历一遍，边遍历边把数保存在TreeSet里边，
 * 保持TreeSet大小为k，
 * 同时利用TreeSet的有序性，判断TreeSet中是否存在与当前数差的绝对值在t之内的
 */
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();

        for(int i = 0; i < nums.length; i++) {
            Long lo = set.lower((long)nums[i] + t + 1);
            if(lo != null && nums[i] - lo <= t) {
                return true;
            }
            set.add((long)nums[i]);
            if(set.size() == (k + 1)) {
                set.remove((long)nums[i - k]);
            }
        }

        return false;
    }
}