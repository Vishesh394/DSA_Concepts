package Binary_sear;
import java.util.*;
//in this search in rotated sorted array II : we have to check if the element is present in the array or not
//where the elements are duplicates in the array
//first approach: brute force(using linear search) : t.c= O(n) , S.c= O(1);

//but we can solve this with the help of binary search also: 

/* //approach :
 1. check if mid == target the return true
 2. check if the left part is sorted :  and then search for the target in left part after eliminating the right part
 3. check if the right part is sorted : and then search for the target in right part by eliminating the left part.
 4. if target found in above the return true.
 5. if not found return false.
 
 4. 
 */
public class searchRotatedSortedArrayII {
    public static boolean search(int [] arr, int target ){
        int l=0;
        int r=arr.length-1;
        while (l<=r) {
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return true;
            }

            //handling the duplicate values
            if(arr[l]==arr[mid] && arr[mid]==arr[r]){
                l++;
                r--;
                continue;
            }
            //check if the left half is sorted or not
            if(arr[l]<=arr[mid]){
                if(arr[l]<=target && target<arr[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            //check if the right half is sorted or not.
            else{
                if(arr[mid]<target && target<=arr[r]){
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