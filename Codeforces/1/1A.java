/*
 * Problem  : 1A
 * Contest  : 1 | Problem : A
 * Language : Java 21 64bit
 * Date     : 27 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        sc.close();

        long stonesX = (n + a - 1) / a;
        long stonesY = (m + a - 1) / a;

        System.out.println(stonesX * stonesY);
    }
}
