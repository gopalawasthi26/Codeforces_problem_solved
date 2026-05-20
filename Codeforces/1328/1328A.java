/*
 * Problem  : 1328A
 * Contest  : 1328 | Problem : A
 * Language : Java 21 64bit
 * Date     : 20 May 2026
 */

import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            long rem = a % b;
            if (rem == 0) {
                out.println(0);
            } else {
                out.println(b - rem);
            }
        }

        scanner.close();
        out.flush();
    }
}
