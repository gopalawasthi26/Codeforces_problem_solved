/*
 * Problem  : 1722A
 * Contest  : 1722 | Problem : A
 * Language : Java 21 64bit
 * Date     : 04 Jun 2026
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ref = {'T', 'i', 'm', 'u', 'r'};
        Arrays.sort(ref);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n != 5) {
                System.out.println("NO");
                continue;
            }
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            if (Arrays.equals(arr, ref)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
