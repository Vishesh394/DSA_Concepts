package Linear_DS.Array.Topics;

import java.util.*;
public class MultidimensionArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //====2D ARRAY ==========
        /*

        1 2 3
        4 5 6
        7 8 9
        
         */

        // int[][] arr= new int[3][];   // number of rows are mandatory

        // int[][] arr={
        //     {1,2,3},  // 0th index
        //     {4,5},   // 1st index 
        //     {6,7,8,9}  // 2nd index--> arr[2]={ 6,7,8,9};
        // };


        int[][] arr=new int[3][4];
        System.out.println(arr.length);  // gives number of rows


        // taking input in 2d array: 
        System.out.println("Taking input for arr[3][4]: ");
        for(int row=0;row<arr.length;row++){

            //for each col in every row
            for(int col=0;col<arr[row].length;col++){  // column: arr[row].length --> length of every row of that array.
                arr[row][col]=sc.nextInt();
            }
        }

        //printing 2D array: 
        System.out.println("The output for arr[3][4]: ");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
        System.out.println();

        }

        //another way of printing 2d array:
        System.out.println("Printing array with to string method: ");
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        // another way: 
        System.out.println("Printing 2d array using enhanced for loop: ");
        for(int [] a: arr){
            System.out.println(Arrays.toString(a));
        }

        sc.close();
    }
    
}
