package Linear_DS.Array.Questions;

import java.util.*;

public class SecLargest {

    //BRUTE FORCE:
    /* 
    public static void getElement(int[]arr, int n){
        Arrays.sort(arr);
        if(n==0||n==1){
            System.out.println(-1+ " "+ 1);
            return;   
        }
        int small=arr[1]; //second smallest
        int large=arr[n-2]; //second largest

        System.out.println("The second samllest element:  "+ small);
        System.out.println("The second largest element: "+large);

    }
     */
    //better approach: 
    /* 
    public static void getElement(int []arr, int n){
        if(n==0||n==1){
            System.out.println(-1+" "+ 1);
            return;
        }
        int small=Integer.MAX_VALUE ,sec_small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE, sec_large=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            small=Math.min(small,arr[i]);
            large=Math.max(large,arr[i]);

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<sec_small && arr[i]!=small){
                sec_small=arr[i];
            }
            if(arr[i]>sec_large && arr[i]!=large){
                sec_large=arr[i];
            }
           

        }
         System.out.println("the second smallest element: "+ sec_small);
            System.out.print("the second largest element: "+ sec_large);

    }
    */
   //optimal approach :nn
    
        
//    }
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]+=sc.nextInt();
        }

        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        //brute force:
        // getElement(nums, n);
        getElement(nums, n);
        
        sc.close();


    }
    
}
