package Hashing;

import java.util.*;

public class greqCntHashing2 {
    public static void main(String[] args) { // ============================FOR character array(WITHOUT HASHMAP)
                                             // ===========================
        // we are taking input of string then convert that string into char array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enter the String: ");
        // taking input for the string
        String str = sc.next(); // or nextLine()
        // converting the string into string array:
        char[] arr = str.toCharArray();

        // printing the array:

        System.out.print("The array is: ");
        // printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // precomputation(hashing)
        int[] hash = new int[256];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // taking the input for the query:
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter character: ");
            char ch = sc.next().charAt(0);

            // fetch frequency:

            System.out.println("frequency: " + hash[ch]);
        }
        sc.close();

    }

}
