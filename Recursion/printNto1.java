package Recursion;

import java.util.*;

public class printNto1 {
    public static void fun(int i, int n){
        if(i<1){
            return ;
        }
        System.out.println(i);
        fun(i-1,n);
    }
    //using backtracking
    /*public static void backtrack(int i, int n){
        if(i>n){
            return;
        }
        backtrack(i+1, n);
        System.out.println(i);
    }
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        fun(n,n);
        //by backtracking
        // backtrack(1,n);
        sc.close();
    }
    
}
