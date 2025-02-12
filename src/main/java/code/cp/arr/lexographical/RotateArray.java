package code.cp.arr.lexographical;

import java.util.Scanner;

//Rotate array to get lexo-graphically smallest array
//Can use this code to rotate array from any given index
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            //Code to rotate array from a specific index to get the final array
            int minValInd = Integer.MAX_VALUE;
            for (int j : A) {
                minValInd = Math.min(minValInd, j);
            }
            for(int i = 0; i < N; i++) {
                if(A[i] == minValInd) {
                    minValInd = i;
                    break;
                }
            }

            int[] lexoSmoll = new int[N];
            for(int i = minValInd; i < N; i++) {
                lexoSmoll[i - minValInd] = A[i];
            }
            for(int i = minValInd - 1; i >= 0; i--) {
                lexoSmoll[N - minValInd + i] = A[i];
            }
            for (int val : lexoSmoll) {
                System.out.print(val + " ");
            }
        }
    }
}
