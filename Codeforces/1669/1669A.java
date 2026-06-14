/*
 * Problem  : 1669A
 * Contest  : 1669 | Problem : A
 * Language : Java 21 64bit
 * Date     : 14 Jun 2026
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int rating = scanner.nextInt();
            if (rating >= 1900) {
                System.out.println("Division 1");
            } else if (rating >= 1600) {
                System.out.println("Division 2");
            } else if (rating >= 1400) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
        scanner.close();
    }
}
