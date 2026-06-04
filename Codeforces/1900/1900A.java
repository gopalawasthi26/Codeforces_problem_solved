/*
 * Problem  : 1900A
 * Contest  : 1900 | Problem : A
 * Language : Java 21 64bit
 * Date     : 04 Jun 2026
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            boolean canSpread = false;
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    count++;
                }
                if (i > 0 && i < n - 1) {
                    if (s.charAt(i - 1) == '.' && s.charAt(i) == '.' && s.charAt(i + 1) == '.') {
                        canSpread = true;
                    }
                }
            }
            
            if (canSpread) {
                System.out.println(2);
            } else {
                System.out.println(count);
            }
        }
        scanner.close();
    }
}
