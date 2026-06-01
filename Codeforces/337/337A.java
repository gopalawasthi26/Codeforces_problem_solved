/*
 * Problem  : 337A
 * Contest  : 337 | Problem : A
 * Language : Java 21 64bit
 * Date     : 01 Jun 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] f = new int[m];
        for (int i = 0; i < m; i++) {
            f[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(f);
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            minDiff = Math.min(minDiff, f[i + n - 1] - f[i]);
        }
        
        System.out.println(minDiff);
    }
}
