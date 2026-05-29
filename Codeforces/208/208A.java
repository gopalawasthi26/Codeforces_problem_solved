/*
 * Problem  : 208A
 * Contest  : 208 | Problem : A
 * Language : Java 21 64bit
 * Date     : 29 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        String original = s.replaceAll("WUB", " ").replaceAll("\\s+", " ").trim();
        
        System.out.println(original);
        scanner.close();
    }
}
