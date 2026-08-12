package Hashing;

import java.util.*;

public class greqCntHashing1 {
    public static void main(String[] args) { // ============================FOR NUMERICAL ARRAY(WITHOUT HASHMAP)
                                             // ===========================
        // ## SO THIS APPROACH IS FOR BOUNDED ARRAY OR SAMLL ARRAY:
        // IT WILL GIVE OUTOFBOUND ERROR:
        // ALSO NEGATIVE NUMBERS ARE NOT ALLOWED:

        Scanner sc = new Scanner(System.in);
        // size of array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array");
        // taking input of array:
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array is: ");
        // printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // precomputation
        int[] hash = new int[100];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        // taking the input for the query:
        System.out.print("Enter the queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            // fetch
            System.out.println(hash[number]);
        }
        sc.close();

    }

}
