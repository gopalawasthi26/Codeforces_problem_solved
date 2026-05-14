/*
 * Problem  : 1030A
 * Contest  : 1030 | Problem : A
 * Language : Java 21 64bit
 * Date     : 14 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;
        
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                isHard = true;
                break;
            }
        }
        
        System.out.println(isHard ? "HARD" : "EASY");
    }
}