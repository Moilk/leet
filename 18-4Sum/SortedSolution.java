import java.util.*;

/**
 * [四数之和]
 * 
 * 方案: 思路跟三数之和 类似，排序 + 双指针
 * 利用有序性和适当的措施就可以避免重复
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length -3; i++) {
            // 避免重复：1号位是该数只能处理一遍，而且只能在第一次出现该数的地方处理
            // 其余位置应该跳过
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < nums.length - 2; j++) {
                // 避免重复: 类似1号位，只能在第二次出现该数的地方处理，
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int s = j + 1;
                int e = nums.length - 1;

                while(s < e) {
                    int dist = target - nums[i] - nums[j] - nums[s];
                    if(nums[e] > dist) {
                        e--;
                    } else if(nums[e] < dist) {
                        s++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[s], nums[e]));
                        // 找到一条匹配之后，对于每个1号位和2号位，这个匹配也只能出现一次
                        while(s < e && nums[s] == nums[s + 1])  s++;
                        while(s < e && nums[e] == nums[e - 1])  e--;
                        // 跳到下一个数上面去
                        s++;
                        e--;
                    }
                }
            }
        }

        return res;
    }
}