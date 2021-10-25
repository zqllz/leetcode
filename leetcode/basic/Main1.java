package basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {

    static int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(new Main1().minPathLength(matrix));
    }

    public int minPathLength(int[][] matrix) {
        int n = matrix.length;
        if (n <= 0) return -1;
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;
            while (size-- > 0) {
                int cur[] = queue.poll();
                if (matrix[cur[0]][cur[1]] == 0) {
                    continue;
                }
                matrix[cur[0]][cur[1]] = 0;
                for (int[] d : direction) {
                    int nx = cur[0] + d[0];
                    int ny = cur[1] + d[1];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n || matrix[nx][ny] == 0) {
                        continue;
                    }
                    if (nx == n - 1 && ny == n - 1) {
                        return res;
                    }
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }
}