package Linear_DS.Array.Topics;
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    /* 
        //=====ARRAY OF PRIMITIVES ====
        int [] arr=new int [5];
        arr[0]=23;
        arr[1]=34;
        arr[3]=43;
        System.out.println(arr[3]);

        // input using for loops 
        System.out.println("Enter the element of the array: ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            
        }

        //iterating an array
        //using for each loop:
        System.out.println("The array is: ");
        for(int num: arr){   // for element in array, print the element
            System.out.print(num+" "); // here num represents element of the array

        }

        // printing an array: using toString() method :
        //converts the array into the string
        System.out.println(Arrays.toString(arr));   // [2, 3, 4, 5, 6]

    */

        //======= ARRAY OF OBJECTS =====

        System.out.println("Enter the strings: ");
        String[] str= new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();

        }
        System.out.println(Arrays.toString(str));

        // modify
        

    sc.close();
    }
    
}
