/*
 * Problem  : 1899A
 * Contest  : 1899 | Problem : A
 * Language : Java 21 64bit
 * Date     : 02 Jun 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
        scanner.close();
    }
}
