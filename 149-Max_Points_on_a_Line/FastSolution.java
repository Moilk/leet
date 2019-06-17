import java.util.*;

/**
 * 用map保存[斜率 -> 个数], 斜率用化简后的分数表示(求最大公约数)
 */
class Solution {
    public int maxPoints(int[][] points) {
        if(points.length <= 2)  return points.length;

        int res = 0;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < points.length - 1; i++) {
            int addition = 1;
            int max = 0;
            for(int j = i + 1; j < points.length; j++) {
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];

                if(dx == 0 && dy == 0) {
                    addition++;
                    continue;
                }

                int g = gcd(dx, dy);

                if(g != 0){
                    dx /= g;
                    dy /= g;
                }

                String key = dx + "#" + dy;
                if(map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
                max = Math.max(max, map.get(key));
            }
            res = Math.max(res, max + addition);
            map.clear();
        }

        return res;
    }

    int gcd(int a, int b) {
            if(b == 0 ) return a;
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] points = {
            {0, 0},
            {1, 1},
            {2, 2},
            {3, 3},
            {4, 4},
            {5, 0},
            {6, 1},
            {7, 2},
            {8, 3},
            {9, 4},
        };
        System.out.println(s.maxPoints(points));
    }
}