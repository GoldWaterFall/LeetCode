package day02;

public class SpiralMatrixII {
    /**
     *
     * @param n 正整数 n
     * @return 元素按顺时针顺序螺旋排列的正方形矩阵
     */
    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = l; i <= r; i++) mat[t][i] = num++; // 从左到右.
            t++;
            for(int i = t; i <= b; i++) mat[i][r] = num++; // 从上到下.
            r--;
            for(int i = r; i >= l; i--) mat[b][i] = num++; // 从右到左.
            b--;
            for(int i = b; i >= t; i--) mat[i][l] = num++; // 从下到上.
            l++;
        }
        return mat;

    }
}
