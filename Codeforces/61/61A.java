/*
 * Problem  : 61A
 * Contest  : 61 | Problem : A
 * Language : Java 21 64bit
 * Date     : 18 May 2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res.append('0');
            } else {
                res.append('1');
            }
        }
        
        System.out.println(res.toString());
    }
}
