/*
 * Problem  : 486A
 * Contest  : 486 | Problem : A
 * Language : Java 21 64bit
 * Date     : 15 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(-(n + 1) / 2);
        }
    }
}
