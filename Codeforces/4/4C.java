/*
 * Problem  : 4C
 * Contest  : 4 | Problem : C
 * Language : Java 21 64bit
 * Date     : 29 May 2026
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            if (map.containsKey(name)) {
                int count = map.get(name);
                map.put(name, count + 1);
                System.out.println(name + count);
            } else {
                map.put(name, 1);
                System.out.println("OK");
            }
        }
        scanner.close();
    }
}
