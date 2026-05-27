/*
 * Problem  : 122A
 * Contest  : 122 | Problem : A
 * Language : Java 21 64bit
 * Date     : 27 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        
        int result = s1.compareTo(s2);
        
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
