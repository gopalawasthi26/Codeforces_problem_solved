/*
 * Problem  : 996A
 * Contest  : 996 | Problem : A
 * Language : Java 21 64bit
 * Date     : 22 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int[] bills = {100, 20, 10, 5, 1};
        int count = 0;
        
        for (int bill : bills) {
            count += n / bill;
            n %= bill;
        }
        
        System.out.println(count);
    }
}
