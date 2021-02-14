package InterviewBit.Dp;

import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < nn; i++) {
            int k = sc.nextInt();
            A.add(k);
        }

        int n = A.size();
        int a[] = new int[n];
        int b[] = new int[n];
        a[0] = 1;
        b[n-1] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (A.get(i) > A.get(j)) {
                    a[i] = Math.max(a[i], a[j] + 1);
                } else
                    a[i] = Math.max(a[i], 1);

            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if(A.get(i)>A.get(j))
                    b[i] = Math.max(b[i], b[j] + 1);
                else
                    b[i] = Math.max(b[i], 1);    
            }
            
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, a[i] + b[i] - 1);
        }
        System.out.println(ans);
        sc.close();

    }
}
