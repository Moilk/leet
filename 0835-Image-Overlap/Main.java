class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        int N_1 = N - 1;
        int res = 0;

        for (int x = -N_1; x <= N_1; x++) {
            for (int y = -N_1; y <= N_1; y++) {
                int sx = Math.max(0, x);
                int ex = Math.min(N_1 + x, N_1);
                int sy = Math.max(0, y);
                int ey = Math.min(N_1 + y, N_1);
                int count = 0;
                for (int i = sx; i <= ex; i++) {
                    for (int j = sy; j <= ey; j++) {
                        if (B[i][j] == 1 && A[i - x][j - y] == 1) {
                            count++;
                        }
                    }
                }
                res = Math.max(res, count);
            }
        }

        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] A = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 1, 0 } };
        int[][] B = { { 0, 0, 1 }, { 0, 1, 1 }, { 0, 0, 1 } };
        System.out.println(new Solution().largestOverlap(A, B));
    }
}