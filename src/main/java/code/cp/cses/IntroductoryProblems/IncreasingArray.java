package code.cp.cses.IntroductoryProblems;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int num = arr[0];
        long steps = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] < num){
                steps += num - arr[i];
                arr[i] = num;
            } else {
                num = arr[i];
            }
        }
        System.out.println(steps);
    }
}
