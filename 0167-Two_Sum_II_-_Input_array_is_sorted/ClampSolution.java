class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum > target) {
                end--;
            } else if(sum < target) {
                start++;
            } else {
                return new int[]{start + 1, end + 1};
            }
      }

       return null;
    }
}