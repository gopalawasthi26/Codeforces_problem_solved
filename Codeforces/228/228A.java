/*
 * Problem  : 228A
 * Contest  : 228 | Problem : A
 * Language : Java 21 64bit
 * Date     : 18 May 2026
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqueColors = new HashSet<>();
        
        for (int i = 0; i < 4; i++) {
            uniqueColors.add(scanner.nextInt());
        }
        
        System.out.println(4 - uniqueColors.size());
    }
}
