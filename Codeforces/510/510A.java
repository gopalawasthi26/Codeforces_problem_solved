/*
 * Problem  : 510A
 * Contest  : 510 | Problem : A
 * Language : Java 21 64bit
 * Date     : 23 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("#".repeat(m));
            } else {
                if ((i / 2) % 2 != 0) {
                    System.out.println(".".repeat(m - 1) + "#");
                } else {
                    System.out.println("#" + ".".repeat(m - 1));
                }
            }
        }
    }
}
