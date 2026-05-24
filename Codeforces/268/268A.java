/*
 * Problem  : 268A
 * Contest  : 268 | Problem : A
 * Language : Java 21 64bit
 * Date     : 24 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] host = new int[n];
        int[] guest = new int[n];
        int[] guestCount = new int[101]; 
        
        for (int i = 0; i < n; i++) {
            host[i] = scanner.nextInt();
            guest[i] = scanner.nextInt();
            guestCount[guest[i]]++;
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += guestCount[host[i]];
        }
        
        System.out.println(answer);
    }
}
