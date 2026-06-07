/*
 * Problem  : 155A
 * Contest  : 155 | Problem : A
 * Language : Java 21 64bit
 * Date     : 07 Jun 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int min = scanner.nextInt();
        int max = min;
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            int score = scanner.nextInt();
            if (score < min) {
                min = score;
                amazing++;
            } else if (score > max) {
                max = score;
                amazing++;
            }
        }
        
        System.out.println(amazing);
        scanner.close();
    }
}
