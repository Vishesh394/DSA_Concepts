package Binary_sear;
import java.util.*;
public class upperBound {
    public static int UB(int[] arr, int target, int n){
        int l=0;
        int r=arr.length-1;
        int ans=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>target){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("enter the elements of the array: ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]+=sc.nextInt();

        }

        System.out.print("the array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("enter the target: ");
        int t=sc.nextInt();


        System.out.print("the upper bound of the array is(indexing): "+UB(arr, t, n));




        sc.close();
    }
}
