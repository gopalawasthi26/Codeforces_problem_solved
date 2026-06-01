/*
 * Problem  : 2222D
 * Contest  : 2222 | Problem : D
 * Language : Java 21 64bit
 * Date     : 01 Jun 2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Element implements Comparable<Element> {
        long pref;
        int id;

        public Element(long pref, int id) {
            this.pref = pref;
            this.id = id;
        }

        @Override
        public int compareTo(Element o) {
            if (this.pref != o.pref) {
                return Long.compare(o.pref, this.pref);
            }
            return Integer.compare(o.id, this.id);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            Element[] elements = new Element[n];
            long currentPref = 0;
            elements[0] = new Element(0, 0);
            for (int i = 1; i < n; i++) {
                currentPref += a[i - 1];
                elements[i] = new Element(currentPref, i);
            }

            java.util.Arrays.sort(elements);

            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[elements[i].id] = i + 1;
            }

            for (int i = 0; i < n; i++) {
                sb.append(p[i]).append(i == n - 1 ? "" : " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
