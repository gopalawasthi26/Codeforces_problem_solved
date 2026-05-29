/*
 * Problem  : 405A
 * Contest  : 405 | Problem : A
 * Language : Java 21 64bit
 * Date     : 29 May 2026
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] cubes = new int[n];
            
            for (int i = 0; i < n; i++) {
                cubes[i] = scanner.nextInt();
            }
            
            Arrays.sort(cubes);
            
            for (int i = 0; i < n; i++) {
                System.out.print(cubes[i] + (i == n - 1 ? "" : " "));
            }
        }
    }
}
