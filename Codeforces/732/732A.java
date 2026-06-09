/*
 * Problem  : 732A
 * Contest  : 732 | Problem : A
 * Language : Java 21 64bit
 * Date     : 09 Jun 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            if ((k * i) % 10 == 0 || (k * i) % 10 == r) {
                System.out.println(i);
                break;
            }
        }
        scanner.close();
    }
}
