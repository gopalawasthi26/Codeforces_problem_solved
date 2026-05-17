/*
 * Problem  : 200B
 * Contest  : 200 | Problem : B
 * Language : Java 21 64bit
 * Date     : 17 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        double sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(st.nextToken());
        }
        
        System.out.println(sum / n);
    }
}
