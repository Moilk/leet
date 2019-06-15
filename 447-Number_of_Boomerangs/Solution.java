import java.util.*;

/**
 * [回旋镖的数量]
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>(points.length);
        for(int i = 0; i < points.length; i++) {
            for(int j = 0; j < points.length; j++) {
                if(i==j)    continue;
                int tmp1 = points[j][0] - points[i][0];
                int tmp2 = points[j][1] - points[i][1];
                int ds =   tmp1 * tmp1 + tmp2 * tmp2;
                if(map.containsKey(ds)) {
                    map.put(ds, map.get(ds) + 1);
                } else {
                    map.put(ds, 1);
                }
            }
            for(int v : map.values()) {
                if(v>=2) {
                    res += v * (v - 1);
                }
            }
            map.clear();
        }

        return res;
    }
}