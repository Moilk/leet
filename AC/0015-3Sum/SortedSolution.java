import java.util.*;

/**
 * [三数之和]
 * 
 * 方案：先排序，对第一个数用遍历，另外两个数就变成了找两数之和，使用双指针法查找
 */
class SortedSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1])  continue;

            int s = i + 1;
            int e = nums.length - 1;

            while(s < e) {
                if(nums[s] < -nums[i] - nums[e]) {
                    s++;
                } else if(nums[e] > -nums[i] - nums[s]) {
                    e--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    while(s < e && nums[s] == nums[s + 1])  s++;
                    while(s < e && nums[e] == nums[e - 1]) e--;
                    s++;
                    e--;
                }
            }
        }

        return res;
    }
}