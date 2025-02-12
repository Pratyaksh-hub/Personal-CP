package code.cp.string.lexographical;

import java.util.Scanner;

//Rotate string to get lexo-graphically smallest string
//Can use this code to rotate string from any given index
public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String S = sc.next();
            int N = S.length();

            // Find the index of the lexicographically smallest character
            char minChar = S.charAt(0);
            int minIndex = 0;
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) < minChar) {
                    minChar = S.charAt(i);
                    minIndex = i;
                }
            }

            String rotatedString = S.substring(minIndex) + S.substring(0, minIndex);

            System.out.println(rotatedString);
        }
        sc.close();
    }
}