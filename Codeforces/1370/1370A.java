/*
 * Problem  : 1370A
 * Contest  : 1370 | Problem : A
 * Language : Java 21 64bit
 * Date     : 03 Jun 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(n / 2);
        }
        
        scanner.close();
    }
}
