/*
 * Problem  : 1343B
 * Contest  : 1343 | Problem : B
 * Language : Java 21 64bit
 * Date     : 03 Jun 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            if (n % 4 != 0) {
                out.println("NO");
            } else {
                out.println("YES");
                long sumEven = 0;
                long sumOdd = 0;
                StringBuilder sb = new StringBuilder();

                for (int i = 2; i <= n; i += 2) {
                    sb.append(i).append(" ");
                    sumEven += i;
                }

                for (int i = 1; i <= n - 3; i += 2) {
                    sb.append(i).append(" ");
                    sumOdd += i;
                }

                sb.append(sumEven - sumOdd);
                out.println(sb.toString());
            }
        }
        out.flush();
    }
}
