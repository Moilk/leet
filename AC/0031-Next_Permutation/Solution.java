class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int e = nums.length - 1;
        
        while (e > 0) {
            if (nums[e] > nums[e - 1]) {
                int v = e;
                while (v < nums.length && nums[e - 1] < nums[v]) {
                    v++;
                }
                swap(nums, e - 1, v - 1);
                break;
            }
            e--;
        }
        reverse(nums, e, nums.length);
    }

    private void reverse(int[] nums, int offset, int end) {
        int s = offset, e = end - 1;
        while (s < e) {
            swap(nums, s++, e--);
        }
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}