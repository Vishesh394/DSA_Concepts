package Linear_DS.Array.Questions;
import java.util.*;

//optimal solution
public class largestElement {
    public static int lE(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[]args){
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


        //calling the function.
        System.out.print("The largest element in array is: "+ lE(nums));
        sc.close();
        
    }
}

