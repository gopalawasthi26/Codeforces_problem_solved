/*
 * Problem  : 1335A
 * Contest  : 1335 | Problem : A
 * Language : Java 21 64bit
 * Date     : 23 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            long n = Long.parseLong(reader.readLine());
            long ans = (n - 1) / 2;
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}
