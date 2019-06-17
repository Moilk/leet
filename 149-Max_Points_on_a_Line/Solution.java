import java.util.*;

/**
 * [直线上最多的点数]
 * 
 * 
 */

public class Solution {
    class Point {
        int x;
        int y;
        int count;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            count = 1;
        }

        @Override
        public boolean equals(Object a) {
            return a instanceof Point && ((Point) a).x == this.x && ((Point) a).y == this.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }

    public int maxPoints(int[][] points) {
        if (points.length <= 2)
            return points.length;

        Map<Point, Integer> map = new HashMap<>();
        for(int i = 0; i < points.length; i++) {
            Point p = new Point(points[i][0], points[i][1]);
            if(map.containsKey(p)) {
                map.put(p, map.get(p) + 1);
            } else {
                map.put(p, 1);
            }
        }

        Point[] mPoints = new Point[map.size()];
        int h = 0;
        for(Map.Entry<Point, Integer> entry : map.entrySet()) {
            Point p = entry.getKey();
            p.count = entry.getValue();
            mPoints[h++] = p;
        }

        List<Set<Integer>> lines = new LinkedList<>();
        int res = 2;

        for (int i = 0; i < mPoints.length; i++) {
            int len = mPoints[i].count;
            for (int j = i + 1; j < mPoints.length; j++) {
                len = mPoints[i].count + mPoints[j].count;
                boolean hasProccessed = false;
                for (Set<Integer> s : lines) {
                    if (s.contains(i) && s.contains(j)) {
                        hasProccessed = true;
                        break;
                    }
                }
                if (hasProccessed)
                    continue;

                Set<Integer> set = new HashSet<>();
                set.add(i);
                set.add(j);
                for (int k = j + 1; k < mPoints.length; k++) {
                    long tmp1 = ((long) mPoints[i].x - mPoints[j].x) * ((long) mPoints[i].y - mPoints[k].y);
                    long tmp2 = ((long) mPoints[i].x - mPoints[k].x) * ((long) mPoints[i].y - mPoints[j].y);
                    if (tmp1 == tmp2) {
                        set.add(k);
                        len += mPoints[k].count;
                    }
                }
                lines.add(set);
                res = Math.max(res, len);
            }
            res = Math.max(res, len);
        }

        return res;
    }
}