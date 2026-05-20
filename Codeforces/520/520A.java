/*
 * Problem  : 520A
 * Contest  : 520 | Problem : A
 * Language : Java 21 64bit
 * Date     : 20 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine(); 
        
        String s = reader.readLine().toLowerCase();
        int mask = 0;

        for (int i = 0; i < s.length(); i++) {
            mask |= (1 << (s.charAt(i) - 'a'));
        }

        if (mask == ((1 << 26) - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
