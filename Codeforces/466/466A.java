/*
 * Problem  : 466A
 * Contest  : 466 | Problem : A
 * Language : Java 21 64bit
 * Date     : 26 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (m * a <= b) {
            System.out.println(n * a);
        } else {
            int option1 = (n / m) * b + (n % m) * a;
            int option2 = ((n / m) + 1) * b;
            int option3 = n * a;
            System.out.println(Math.min(option1, Math.min(option2, option3)));
        }
    }
}
