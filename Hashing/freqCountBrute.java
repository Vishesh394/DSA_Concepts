package Hashing;

import java.util.*;

public class freqCountBrute {
    // count number of element in arr:
    // brute force:
    public static int countNum(int num, int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 6, 4 };
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("the count of number is: " + countNum(n, arr));
        sc.close();

    }

}