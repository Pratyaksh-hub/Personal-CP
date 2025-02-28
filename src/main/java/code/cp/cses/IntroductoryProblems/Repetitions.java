package code.cp.cses.IntroductoryProblems;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        sc.close();
        System.out.println(method1(S, n));
    }

    private static int method1(String S, int n) {
        char c = S.charAt(0);
        int ct = 1;
        int maxx = 1;
        for(int i = 1; i < n; i++) {
            if(c == S.charAt(i)) {
                ct++;
            } else {
                c = S.charAt(i);
                ct = 1;
            }
            maxx = Math.max(maxx, ct);
        }
        return maxx;
    }
}
