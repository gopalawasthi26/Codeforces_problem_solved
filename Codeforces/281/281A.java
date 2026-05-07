/*
 * Problem  : 281A
 * Contest  : 281 | Problem : A
 * Language : Java 21 64bit
 * Date     : 07 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String word = sc.next();
            // Capitalize first character and concatenate rest of string
            String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            System.out.println(result);
        }
        sc.close();
    }
}
