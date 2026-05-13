/*
 * Problem  : 677A
 * Contest  : 677 | Problem : A
 * Language : Java 21 64bit
 * Date     : 13 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            int h = sc.nextInt();
            
            int totalWidth = 0;
            
            for (int i = 0; i < n; i++) {
                int personHeight = sc.nextInt();
                
        
                if (personHeight > h) {
                    totalWidth += 2;
                } else {
                    totalWidth += 1;
                }
            }
            
            System.out.println(totalWidth);
        }
    }
}
