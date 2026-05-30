/*
 * Problem  : unknownA
 * Contest  : unknown | Problem : A
 * Language : Java 21 64bit
 * Date     : 30 May 2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] counts = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            counts[Integer.parseInt(st.nextToken())]++;
        }

        int taxis = counts[4];
        
        taxis += counts[3];
        counts[1] = Math.max(0, counts[1] - counts[3]);
        
        taxis += counts[2] / 2;
        counts[2] %= 2;
        
        if (counts[2] > 0) {
            taxis++;
            counts[1] = Math.max(0, counts[1] - 2);
        }
        
        taxis += (counts[1] + 3) / 4;

        System.out.println(taxis);
    }
}
