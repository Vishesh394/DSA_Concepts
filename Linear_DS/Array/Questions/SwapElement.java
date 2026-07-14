package Linear_DS.Array.Questions;
import java.util.*;
public class SwapElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size=in.nextInt();
        int[] arr=Input(size);
        Output(arr);
        System.out.println();
        System.out.println("Enter the indices of elements to swap: ");
        int i=in.nextInt();
        int j=in.nextInt();
        swap(arr,i,j);
        Output(arr);
        in.close();


    }
//taking input of array: 
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

    //Output
    public static void Output(int[] arr){
        System.out.println("The elements of array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

    //swap the elements of array
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
}
