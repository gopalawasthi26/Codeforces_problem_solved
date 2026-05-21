/*
 * Problem  : 144A
 * Contest  : 144 | Problem : A
 * Language : Java 21 64bit
 * Date     : 21 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] heights = new int[n];
        int maxIndex = 0;
        int minIndex = 0;
        
        heights[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            heights[i] = scanner.nextInt();
            
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
            if (heights[i] <= heights[minIndex]) {
                minIndex = i;
            }
        }
        
        int swaps = (n - 1 - minIndex) + maxIndex;
        if (maxIndex > minIndex) {
            swaps--;
        }
        
        System.out.println(swaps);
    }
}
