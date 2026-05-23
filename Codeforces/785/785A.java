/*
 * Problem  : 785A
 * Contest  : 785 | Problem : A
 * Language : Java 21 64bit
 * Date     : 23 May 2026
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());

        long totalFaces = 0;

        for (int i = 0; i < n; i++) {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String nextLine = reader.readLine();
                if (nextLine == null) break;
                tokenizer = new StringTokenizer(nextLine);
            }
            
            String polyhedron = tokenizer.nextToken();
            totalFaces += switch (polyhedron) {
                case "Tetrahedron" -> 4;
                case "Cube" -> 6;
                case "Octahedron" -> 8;
                case "Dodecahedron" -> 12;
                case "Icosahedron" -> 20;
                default -> 0;
            };
        }

        System.out.println(totalFaces);
    }
}
