package Recursion;
import java.util.*;
//sum of first N numbers:
public class sumFirstNnums {
    //functional recursion:
   /*  public static int fun(int n){
        if(n==0){
            return 0;
        }
        int sum= n + fun(n-1);
        return sum; 
    }*/
   //parameterized recursion:
   public static int  fun(int i, int sum){
     if(i<1){
        return sum;
     }
     return fun(i-1,sum+i);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the N upto which you want to print: ");
        int n=sc.nextInt();
        

        // System.out.println("the sum of first "+n+" numbers are: "+fun(n));
        System.out.print ("the sum of first "+ n+  " numbers are: " + fun(n,0));
        

        sc.close();
    }
    
}
