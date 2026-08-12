package Recursion;
import java.util.*;
public class print1ToN {
    public static void fun(int i,int n){
        if(i>n){return;}
        System.out.println(i);
        fun(i+1,n);
    }
    //by backtrack:
    /* public static void backtrack(int i,int n){
        if(i<1){return;}
        backtrack(i-1,n);
        System.out.println(i);
    }
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n:");
        int n=sc.nextInt();
        fun(1,n);
        // backtrack(n,n);
        sc.close();
        
    }
    
}
