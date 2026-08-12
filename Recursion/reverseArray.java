package Recursion;

import java.util.*;

public class reverseArray {
    //brute force:
    /*public static int[] revArr(int[] arr ){
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[n-1-i];
        }
        return ans;
    }
    */
   //better approach: two pointer approach:
   /*public static int[] revArr(int [] arr){
    int p1=0;
    int p2=arr.length-1;
    while(p1<p2){
        int temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
        p1++;
        p2--;
    }
    return arr;
   }
    */

   //using Java collection library: Collections.reverse(): it will take list as input.
   public static void revArr(List<Integer>arr){
    Collections.reverse(arr);

   }

    //driver function(or main function):

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        // System.out.print("Enter the size of  array: ");
        // int n=sc.nextInt();
        // int [] nums= new int[n];
        //Taking input of array:
        /*System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        */

        //printing array:
        /*
        System.out.print("the input array is: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        */
        //reverse: brute force
        
        /*int [] result=revArr(nums);
        System.out.print("\nThe reversed array is:");
        for(int num: result ){
            System.out.print(num+" ");
        }
        System.out.println();
        */
       //reverse: better approach
        /*
       int [] result=revArr(nums);
        System.out.print("\nThe reversed array is:");

       for(int num: result){
        System.out.print(num+ " ");
       }
       System.out.println();
        */

       //using built-in library of Java

    //  /*
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Original List: " + nums);
        revArr(nums);
        System.out.println("Reversed List: " + nums);

        


        // */
        sc.close();

    }
}
