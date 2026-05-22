/*
 * Problem  : 443A
 * Contest  : 443 | Problem : A
 * Language : Java 21 64bit
 * Date     : 22 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        Set<Character> distinctLetters = new HashSet<>();
        
        for (char ch : line.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                distinctLetters.add(ch);
            }
        }

        System.out.println(distinctLetters.size());
    }
}
