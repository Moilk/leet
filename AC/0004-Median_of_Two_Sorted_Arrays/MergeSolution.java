public class MergeSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int[] merge = new int[nums1.length + nums2.length];

    	int i = 0, j = 0;
    	for( int k = 0; k < merge.length; k++) {
    		if ( i >= nums1.length ) {
    			merge[k] = nums2[j++];
    		} else if ( j >= nums2.length ) {
    			merge[k] = nums1[i++];
    		} else if ( nums1[i] < nums2[j] ) {
    			merge[k] = nums1[i++];
    		} else {
    			merge[k] = nums2[j++];
    		}
    	}

    	i = (merge.length - 1) / 2;
    	j = merge.length / 2;

        return merge[i] + (merge[j] - merge[i]) / 2.0;
    }
}