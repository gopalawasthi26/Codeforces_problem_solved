/*
 * Problem  : 514A
 * Contest  : 514 | Problem : A
 * Language : Java 21 64bit
 * Date     : 26 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = c - '0';
            
            if (i == 0 && digit == 9) {
                sb.append('9');
            } else if (digit >= 5) {
                sb.append(9 - digit);
            } else {
                sb.append(digit);
            }
        }
        
        System.out.println(sb.toString());
        scanner.close();
    }
}
