/*
 * Problem  : 141A
 * Contest  : 141 | Problem : A
 * Language : Java 21 64bit
 * Date     : 25 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String guest = reader.readLine();
        String host = reader.readLine();
        String pile = reader.readLine();
        
        char[] combined = (guest + host).toCharArray();
        char[] shuffled = pile.toCharArray();
        
        Arrays.sort(combined);
        Arrays.sort(shuffled);
        
        if (Arrays.equals(combined, shuffled)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
