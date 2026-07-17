package Binary_sear;
import java.util.*;
public class searchRotatedSortedArray {
    public static boolean search(int[]arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return true;
            }
            //check if the left part is sorted or not: 
            if(arr[l]<arr[mid]){
                if(arr[l]<=target && target<arr[mid]){
                    r=mid-1;

                }
                else{
                    l=mid+1;
                }
            }

            //check if the right part is sorted or not:
            else {
                if(target>arr[mid]&& target<arr[r]){
                    l=mid+1;

                }
                else{
                    r=mid-1;
                }
            }


        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        System.out.print("the array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter the target: ");
        int t=sc.nextInt();

        System.out.println("Is element present in array: "+ search(arr,t));
        sc.close();
    }

    
}