/*
 * Problem  : 318A
 * Contest  : 318 | Problem : A
 * Language : Java 21 64bit
 * Date     : 29 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        
        long oddsCount = (n + 1) / 2;
        
        if (k <= oddsCount) {
            System.out.println(k * 2 - 1);
        } else {
            System.out.println((k - oddsCount) * 2);
        }
    }
}
