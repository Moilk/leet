import java.util.*;

class Solution {
    public int maxArea(int[] height) {
 		int res = 0;
 		int s = 0, e = height.length - 1;

 		while(s < e) {
 			res = Math.max(res, (e - s) * Math.min(height[s], height[e]));
 			if(height[s] < height[e]) {
 				int v = height[s];
 				while((++s) < e && height[s] <= v) ;
 			} else {
 				int v = height[e];
 				while((--e) > s && height[e] <=v) ;
 			}
 		}

 		return res;
    }

    public static void main(String[] args) {
    	int[] data = {
    		1,8,6,2,5,4,8,3,7
    	};

    	Solution s = new Solution();
    	System.out.println(s.maxArea(data));
    }
}