class BinarySearchSolution {
    public int[] twoSum(int[] numbers, int target) {
    	int N = numbers.length;
       int half = target / 2;
       for(int i = 0; i < N && numbers[i] <= half; i++) {
       		int s = binarySearch(numbers, i + 1, N - 1, target - numbers[i]);
       		 if( s > 0)	{
       		 	return new int[]{i + 1, s + 1};
       		 }
       }

       return null;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
    	if(start > end)	return -1;

    	int mid = start + (end - start) /2;
    	if(nums[mid] < target) {
    		return binarySearch(nums, mid + 1, end, target);
    	} else if(nums[mid] > target) {
    		return binarySearch(nums, start, mid - 1, target);
    	} else {
    		return mid;
    	}
    }
}