import java.util.*;

public class SortedSolution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int absDiff = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int s = i + 1;
            int e = nums.length - 1;
            while(s < e) {
                int sum = nums[i] + nums[s] + nums[e];
                int tmp = Math.abs(sum - target);
                if(tmp < absDiff) {
                    absDiff = tmp;
                    res = sum;
                }
                if(sum > target) {
                    while(s < e && nums[e] == nums[e - 1])  e--;
                    e--;
                } else if(sum < target) {
                    while(s < e && nums[s] == nums[s + 1])  s++;
                    s++;
                } else {
                    break;
                }
            }
        }

        return res;
    }
} 