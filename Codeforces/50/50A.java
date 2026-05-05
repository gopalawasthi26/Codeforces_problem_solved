/*
 * Problem  : 50A
 * Contest  : 50 | Problem : A
 * Language : Java 21 64bit
 * Date     : 05 May 2026
 */

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = (m * n) / 2;

        System.out.println(result);
        sc.close();
    }
}