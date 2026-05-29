/*
 * Problem  : 133A
 * Contest  : 133 | Problem : A
 * Language : Java 21 64bit
 * Date     : 29 May 2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s.indexOf('H') >= 0 || s.indexOf('Q') >= 0 || s.indexOf('9') >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
