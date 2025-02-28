package code.cp.cses.IntroductoryProblems;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();

        System.out.print(n + " ");
        while(n != 1) {
            if(n%2 == 0) {
                n /= 2;
            } else {
                n = n*3+1;
            }
            System.out.print(n + " ");
        }
    }
}
