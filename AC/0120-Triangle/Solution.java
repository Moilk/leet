import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[] last = new int[n+1];
        int[] cur = new int[n+1];
        for(int i = 0; i <=n; i++) {
            last[i] = Integer.MAX_VALUE;
            cur[i] = Integer.MAX_VALUE;
        }

        last[1] = 0;
        for(List<Integer> line : triangle) {
            int i = 1;
            for(int node : line) {
                cur[i] = Math.min(last[i], last[i - 1]) + node;
                i++;
            }
            int[] tmp = last;
            last = cur;
            cur = tmp;
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1; i <=n; i++) {
            min = Math.min(min, last[i]);
        }

        return min;
    }
}