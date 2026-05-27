/*
 * Problem  : 58A
 * Contest  : 58 | Problem : A
 * Language : Java 21 64bit
 * Date     : 27 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        
        String target = "hello";
        int tIdx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(tIdx)) {
                tIdx++;
                if (tIdx == target.length()) {
                    break;
                }
            }
        }
        
        if (tIdx == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

