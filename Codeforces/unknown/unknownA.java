/*
 * Problem  : unknownA
 * Contest  : unknown | Problem : A
 * Language : Java 21 64bit
 * Date     : 04 Jun 2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cost = new int[4];
        for (int i = 0; i < 4; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        String s = br.readLine();
        long totalCalories = 0;

        for (int i = 0; i < s.length(); i++) {
            int strip = s.charAt(i) - '1';
            totalCalories += cost[strip];
        }

        System.out.println(totalCalories);
    }
}
