/*
 * Problem  : 469A
 * Contest  : 469 | Problem : A
 * Language : Java 21 64bit
 * Date     : 21 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean[] cleared = new boolean[n + 1];
        int count = 0;
        
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            
            for (int j = 0; j < p; j++) {
                int level = Integer.parseInt(st.nextToken());
                if (!cleared[level]) {
                    cleared[level] = true;
                    count++;
                }
            }
        }
        
        if (count == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
