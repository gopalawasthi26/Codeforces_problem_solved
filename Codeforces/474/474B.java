/*
 * Problem  : 474B
 * Contest  : 474 | Problem : B
 * Language : Java 21 64bit
 * Date     : 26 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int[] prefixSums = new int[n];

        tokenizer = new StringTokenizer(reader.readLine());
        prefixSums[0] = Integer.parseInt(tokenizer.nextToken());
        for (int i = 1; i < n; i++) {
            prefixSums[i] = prefixSums[i - 1] + Integer.parseInt(tokenizer.nextToken());
        }

        int m = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(tokenizer.nextToken());
            int index = Arrays.binarySearch(prefixSums, query);
            if (index < 0) {
                index = -index - 1;
            }
            out.println(index + 1);
        }

        out.flush();
    }
}
