import java.util.*;

/**
 * 最接近三数之和
 * 
 * 方案: 暴力法
 */
class BruteForceSolution {
    public int threeSumClosest(int[] nums, int target) {
        int adsDiff = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int tmp = Math.abs(sum - target);
                    if(tmp < adsDiff) {
                        adsDiff = tmp;
                        res = sum;
                    }
                }
            }
        }

        return res;
    }
}