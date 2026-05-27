/*
 * Problem  : 118A
 * Contest  : 118 | Problem : A
 * Language : Java 21 64bit
 * Date     : 27 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toLowerCase();
        
        String consonants = s.replaceAll("[aeiouy]", "");
        
        StringBuilder result = new StringBuilder();
        for (char c : consonants.toCharArray()) {
            result.append('.').append(c);
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}
