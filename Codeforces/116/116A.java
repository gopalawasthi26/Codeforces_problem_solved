/*
 * Problem  : 116A
 * Contest  : 116 | Problem : A
 * Language : Java 21 64bit
 * Date     : 13 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentCapacity = 0;
        int minCapacity = 0;
        
        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            currentCapacity -= exit;
            currentCapacity += enter;
            
            if (currentCapacity > minCapacity) {
                minCapacity = currentCapacity;
            }
        }
        System.out.println(minCapacity);
    }
}
