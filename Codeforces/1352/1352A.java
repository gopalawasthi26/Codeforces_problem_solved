/*
 * Problem  : 1352A
 * Contest  : 1352 | Problem : A
 * Language : Java 21 64bit
 * Date     : 24 May 2026
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();
            int multiplier = 1;
            
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    roundNumbers.add(digit * multiplier);
                }
                n /= 10;
                multiplier *= 10;
            }
            
            System.out.println(roundNumbers.size());
            for (int j = 0; j < roundNumbers.size(); j++) {
                System.out.print(roundNumbers.get(j) + (j == roundNumbers.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        scanner.close();
    }
}
