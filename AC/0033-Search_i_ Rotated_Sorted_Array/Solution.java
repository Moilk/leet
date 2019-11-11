class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int mp = minPoint(nums);
        int ans = binarySearch(nums, 0, mp - 1, target);

        return ans >= 0 ? ans : binarySearch(nums, mp, nums.length - 1, target);
    }

    private static int minPoint(int[] nums) {
        int s = 0, e = nums.length - 1;
        if (nums[s] <= nums[e]) return s;
        while (nums[s] > nums[e] && e - s > 1) {
            int mid = s + (e - s) / 2;
            if (nums[mid] >= nums[s]) {
                s = mid;
            } else {
                e = mid;
            }
        }

        return e;
    }

    private static int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}