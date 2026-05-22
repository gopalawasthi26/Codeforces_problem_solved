/*
 * Problem  : 148A
 * Contest  : 148 | Problem : A
 * Language : Java 21 64bit
 * Date     : 22 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int k = scanner.nextInt();
            int l = scanner.nextInt();
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int d = scanner.nextInt();

            int count = 0;
            for (int i = 1; i <= d; i++) {
                if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
