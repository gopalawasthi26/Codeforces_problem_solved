/*
 * Problem  : 96A
 * Contest  : 96 | Problem : A
 * Language : Java 21 64bit
 * Date     : 27 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        if (s.contains("0000000") || s.contains("1111111")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
