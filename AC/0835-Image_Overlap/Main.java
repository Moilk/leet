class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        int N_1 = N - 1;
        int res = 0;

        for (int x = -N_1; x <= N_1; x++) {
            for (int y = -N_1; y <= N_1; y++) {
                int bsx = Math.max(0, x);
                int bex = Math.min(N_1 + x, N_1);
                int bsy = Math.max(0, y);
                int bey = Math.min(N_1 + y, N_1);

                // 减5ms
                if ((bex - bsx + 1) * (bey - bsy + 1) <= res) {
                    continue;
                }

                int count = 0;
                for (int i = bsx; i <= bex; i++) {
                    for (int j = bsy; j <= bey; j++) {
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