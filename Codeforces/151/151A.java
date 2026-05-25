/*
 * Problem  : 151A
 * Contest  : 151 | Problem : A
 * Language : Java 21 64bit
 * Date     : 25 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        
        int totalDrink = k * l;
        int drinkToasts = totalDrink / nl;
        int limeToasts = c * d;
        int saltToasts = p / np;
        
        int minToasts = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));
        int ans = minToasts / n;
        
        System.out.println(ans);
        
        sc.close();
    }
}
