/*
 * Problem  : 2216A
 * Contest  : 2216 | Problem : A
 * Language : Java 21 64bit
 * Date     : 05 Jun 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;
        
        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        StringBuilder result = new StringBuilder();
        
        for (int tc = 0; tc < t; tc++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());
            
            tokenizer = new StringTokenizer(reader.readLine());
            int[] a = new int[k + 1];
            for (int i = 1; i <= k; i++) {
                a[i] = Integer.parseInt(tokenizer.nextToken());
            }
            
            int[] b = new int[n + 1];
            ArrayList<Integer>[] coursesAtLevel = new ArrayList[k + 1];
            for (int i = 1; i <= k; i++) {
                coursesAtLevel[i] = new ArrayList<>();
            }
            
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 1; i <= n; i++) {
                b[i] = Integer.parseInt(tokenizer.nextToken());
                if (b[i] <= k) {
                    coursesAtLevel[b[i]].add(i);
                }
            }
            
            ArrayList<Integer> operations = new ArrayList<>();
            for (int level = k; level >= 1; level--) {
                for (int course : coursesAtLevel[level]) {
                    int steps = (k + 1) - level;
                    for (int s = 0; s < steps; s++) {
                        operations.add(course);
                    }
                }
            }
            
            result.append(operations.size()).append("\n");
            for (int i = 0; i < operations.size(); i++) {
                result.append(operations.get(i));
                if (i < operations.size() - 1) {
                    result.append(" ");
                }
            }
            result.append("\n");
        }
        System.out.print(result.toString());
    }
}
