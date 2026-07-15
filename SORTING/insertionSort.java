package SORTING;
import java.util.*;
public class insertionSort {

    //Insertion sort: takes an element &place it in its correct position.
    public static void sort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }
    // Main function: 
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        //take length input
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        //enter unsorted array:
        System.out.println("Enter the unsorted array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //print unosrted array: 
        System.out.print("the unsorted array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

        //calling sort function
        sort(arr);

        // printing the sorted array
        System.out.print("the sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
