/*
 * Problem  : 160A
 * Contest  : 160 | Problem : A
 * Language : Java 21 64bit
 * Date     : 29 May 2026
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
            totalSum += coins[i];
        }

        Arrays.sort(coins);

        int mySum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            count++;
            if (mySum > totalSum - mySum) {
                break;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
