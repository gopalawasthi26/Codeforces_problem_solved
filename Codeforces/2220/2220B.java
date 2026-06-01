/*
 * Problem  : 2220B
 * Contest  : 2220 | Problem : B
 * Language : Java 21 64bit
 * Date     : 01 Jun 2026
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
        if (line == null || line.trim().isEmpty()) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            line = reader.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = reader.readLine();
            }
            if (line == null) break;

            tokenizer = new StringTokenizer(line);
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());

            line = reader.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = reader.readLine();
            }
            if (line == null) break;

            tokenizer = new StringTokenizer(line);
            int maxConsecutive = 1;
            int currentConsecutive = 0;
            int lastVal = -1;

            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(tokenizer.nextToken());
                if (a == lastVal) {
                    currentConsecutive++;
                } else {
                    if (currentConsecutive > maxConsecutive) {
                        maxConsecutive = currentConsecutive;
                    }
                    lastVal = a;
                    currentConsecutive = 1;
                }
            }
            if (currentConsecutive > maxConsecutive) {
                maxConsecutive = currentConsecutive;
            }

            if (maxConsecutive >= m) {
                result.append("NO\n");
            } else {
                result.append("YES\n");
            }
        }
        System.out.print(result);
    }
}
