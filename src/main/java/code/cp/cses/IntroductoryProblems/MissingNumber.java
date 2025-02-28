package code.cp.cses.IntroductoryProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(linearSearchWithArray(nums, n));
    }

    //Approach 1 - Using Set to store data
    private static int linearSearchWithSet(int[] nums, int n) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n - 1; i++) {
            set.add(nums[i]);
        }
        int i = 1;
        while(i <= n) {
            if(!set.contains(i)) {
                return i;
            }
            i++;
        }
        return -1;
    }
    //Approach 2 - Using Array to store data
    private static int linearSearchWithArray(int[] nums, int n) {
        int[] arr = new int[n + 1];
        for(int i = 0; i < n - 1; i++) {
            arr[nums[i]]++;
        }

        for(int i = 1; i <= n; i++) {
            if(arr[i] == 0) return i;
        }
        return -1;
    }
}
