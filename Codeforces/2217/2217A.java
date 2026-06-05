/*
 * Problem  : 2217A
 * Contest  : 2217 | Problem : A
 * Language : Java 21 64bit
 * Date     : 05 Jun 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(r.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            long sum = 0;
            st = new StringTokenizer(r.readLine());
            for (int i = 0; i < n; i++) {
                sum += Long.parseLong(st.nextToken());
            }
            
            boolean firstWinsNormal = (sum % 2 != 0);
            boolean firstWinsSpecial = (( (long)n * k) % 2 == 0);
            
            if (firstWinsNormal || firstWinsSpecial) {
                w.println("YES");
            } else {
                w.println("NO");
            }
        }
        w.flush();
    }
}
