/*
 * Problem  : 69A
 * Contest  : 69 | Problem : A
 * Language : Java 21 64bit
 * Date     : 27 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        int sumX = 0, sumY = 0, sumZ = 0;
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            sumX += Integer.parseInt(st.nextToken());
            sumY += Integer.parseInt(st.nextToken());
            sumZ += Integer.parseInt(st.nextToken());
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
