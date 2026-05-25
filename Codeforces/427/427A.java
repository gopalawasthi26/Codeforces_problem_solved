/*
 * Problem  : 427A
 * Contest  : 427 | Problem : A
 * Language : Java 21 64bit
 * Date     : 25 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int availableOfficers = 0;
        int untreatedCrimes = 0;
        
        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            if (event > 0) {
                availableOfficers += event;
            } else {
                if (availableOfficers > 0) {
                    availableOfficers--;
                } else {
                    untreatedCrimes++;
                }
            }
        }
        
        System.out.println(untreatedCrimes);
        sc.close();
    }
}
