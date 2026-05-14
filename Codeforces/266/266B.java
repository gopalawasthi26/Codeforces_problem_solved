/*
 * Problem  : 266B
 * Contest  : 266 | Problem : B
 * Language : Java 21 64bit
 * Date     : 14 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] queue = sc.next().toCharArray();
        
        while (t-- > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i++;
                }
            }
        }
        System.out.println(new String(queue));
    }
}
