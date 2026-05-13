/*
 * Problem  : 271A
 * Contest  : 271 | Problem : A
 * Language : Java 21 64bit
 * Date     : 13 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        while (true) {
            y++;
            String s = String.valueOf(y);
            if (s.charAt(0) != s.charAt(1) && 
                s.charAt(0) != s.charAt(2) && 
                s.charAt(0) != s.charAt(3) && 
                s.charAt(1) != s.charAt(2) && 
                s.charAt(1) != s.charAt(3) && 
                s.charAt(2) != s.charAt(3)) {
                System.out.println(s);
                break;
            }
        }
    }
}
