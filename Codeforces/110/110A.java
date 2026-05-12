/*
 * Problem  : 110A
 * Contest  : 110 | Problem : A
 * Language : Java 21 64bit
 * Date     : 12 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner is suitable for reading the long input as a String
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String input = sc.next();
            long luckyDigitCount = 0;

            
            for (char c : input.toCharArray()) {
                if (c == '4' || c == '7') {
                    luckyDigitCount++;
                }
            }

        
            if (luckyDigitCount == 4 || luckyDigitCount == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
