/*
 * Problem  : 723A
 * Contest  : 723 | Problem : A
 * Language : Java 21 64bit
 * Date     : 25 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();
            
            int min = Math.min(x1, Math.min(x2, x3));
            int max = Math.max(x1, Math.max(x2, x3));
            
            System.out.println(max - min);
        }
    }
}
