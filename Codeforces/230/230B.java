/*
 * Problem  : 230B
 * Contest  : 230 | Problem : B
 * Language : Java 21 64bit
 * Date     : 02 Jun 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX = 1000000;
    private static final boolean[] isNotPrime = new boolean[MAX + 1];

    static {
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());
                long r = (long) Math.sqrt(x);
                if (r * r == x && !isNotPrime[(int) r]) {
                    pw.println("YES");
                } else {
                    pw.println("NO");
                }
            }
        }
        pw.flush();
    }
}

