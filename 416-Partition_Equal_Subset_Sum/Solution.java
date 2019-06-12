import java.util.*;

class Solution {
    public boolean canPartition(int[] nums) {
    	if(nums.length == 0)	return true;

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
        	sum += nums[i];
        }
        if((sum % 2) == 1){
        	return false;
        }


        return helper(sum / 2, nums);
    }

    public boolean helper(int target, int[] w) {
    	boolean[][] dp = new boolean[w.length + 1][target + 1];
    	for(int i = 1; i <= w.length; i++) {
    		dp[i][0] = true;
    		for(int j = 1; j <= target; j++) {
    			if(j >= w[i - 1]) 
    				dp[i][j] = dp[i - 1][j] || dp[i - 1][j - w[i - 1]];
    			if(j == target && dp[i][j])	return true;
    		}
    	}

    	return false;
    }
}