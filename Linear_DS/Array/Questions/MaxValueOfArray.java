package Linear_DS.Array.Questions;
import java.util.*;
public class MaxValueOfArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=in.nextInt();  
        int[] arr=Input(size);
        System.out.println();
        Output(arr);
        System.out.println();
        int max=getMax(arr);
        System.out.println("The maximum value in the array is: " + max);
        in.close();
    }

// Input function
    public static int[] Input(int n){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        return arr;
    }

// Output function
    public static void Output(int[] arr){
        System.out.println("The elements of array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
//max function
    public static int getMax(int[]a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];

            }
        }
        return max;
    }
}
