/*
 * Problem  : 750A
 * Contest  : 750 | Problem : A
 * Language : Java 21 64bit
 * Date     : 07 Jun 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        
        int availableTime = 240 - k;
        int timeSpent = 0;
        int problemsSolved = 0;

        for (int i = 1; i <= n; i++) {
            timeSpent += i * 5;
            if (timeSpent <= availableTime) {
                problemsSolved++;
            } else {
                break;
            }
        }
        
        System.out.println(problemsSolved);
    }
}
