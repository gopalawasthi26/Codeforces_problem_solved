/*
 * Problem  : 1703A
 * Contest  : 1703 | Problem : A
 * Language : Java 21 64bit
 * Date     : 25 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String s = reader.readLine();
            if (s.length() == 3 && 
                (s.charAt(0) == 'y' || s.charAt(0) == 'Y') && 
                (s.charAt(1) == 'e' || s.charAt(1) == 'E') && 
                (s.charAt(2) == 's' || s.charAt(2) == 'S')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
