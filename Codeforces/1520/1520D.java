/*
 * Problem  : 1520D
 * Contest  : 1520 | Problem : D
 * Language : Java 21 64bit
 * Date     : 26 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            Map<Integer, Long> map = new HashMap<>();
            long ans = 0;

            for (int i = 1; i <= n; i++) {
                int a = Integer.parseInt(st.nextToken());
                int diff = a - i;

                long count = map.getOrDefault(diff, 0L);
                ans += count;
                map.put(diff, count + 1);
            }

            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}
