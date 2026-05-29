/*
 * Problem  : 580A
 * Contest  : 580 | Problem : A
 * Language : Java 21 64bit
 * Date     : 29 May 2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        int[][] grid = new int[n + 2][m + 2];
        int ans = 0;

        for (int step = 1; step <= k; step++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int r = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());

            if (grid[r][c] == 1) continue;

            grid[r][c] = 1;

            if (ans == 0) {
                if ((grid[r][c] & grid[r + 1][c] & grid[r][c + 1] & grid[r + 1][c + 1]) == 1 ||
                    (grid[r][c] & grid[r - 1][c] & grid[r][c + 1] & grid[r - 1][c + 1]) == 1 ||
                    (grid[r][c] & grid[r + 1][c] & grid[r][c - 1] & grid[r + 1][c - 1]) == 1 ||
                    (grid[r][c] & grid[r - 1][c] & grid[r][c - 1] & grid[r - 1][c - 1]) == 1) {
                    ans = step;
                }
            }
        }

        System.out.println(ans);
    }
}
