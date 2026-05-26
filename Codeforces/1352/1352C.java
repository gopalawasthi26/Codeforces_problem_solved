/*
 * Problem  : 1352C
 * Contest  : 1352 | Problem : C
 * Language : Java 21 64bit
 * Date     : 26 May 2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                line = reader.readLine();
                if (line == null) break;
                tokenizer = new StringTokenizer(line);
            }
            long n = Long.parseLong(tokenizer.nextToken());
            long k = Long.parseLong(tokenizer.nextToken());

            long skipped = (k - 1) / (n - 1);
            long ans = k + skipped;
            output.append(ans).append("\n");
        }
        System.out.print(output);
    }
}
