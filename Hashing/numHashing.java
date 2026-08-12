package Hashing;

import java.util.*;

public class numHashing {
    // ## IN THIS WE ARE GOING TO DO THE HASHING OPERATION USING HASHMAP:
    // =================================== FOR NUMERICAL ARRAY
    // ===========================
    // enter size of array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        // taking input for array:
        System.out.println("Enter elements(numbers) in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // printing the array:
        System.out.print("the array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // making hashmap:
        System.out.println("Storing the numbers in hashmap........");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        // iterating in the map:
        System.out.println("The map is: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // taking the query:

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {

            System.out.print("Enter number: ");
            int number = sc.nextInt();

            // fetching the number:
            System.out.println("The frequency is: " + map.get(number));
        }
        sc.close();
    }

}
