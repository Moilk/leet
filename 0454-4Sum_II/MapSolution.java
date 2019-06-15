import java.util.*;

/**
 * [四数相加 II]
 * 
 * 方案: 用map保存其中两个数组的和(两数之和 -> 这个和出现的次数)，时间复杂度为O(N^2)，空间复杂度也为O(N^2)
 */
class MapSolution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int N = A.length;
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int sum = C[i] + D[j];
                if(map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int sum = A[i] + B[j];
                if(map.containsKey(-sum)) {
                    res += map.get(-sum);
                }
            }
        }


        return res;
    }
}