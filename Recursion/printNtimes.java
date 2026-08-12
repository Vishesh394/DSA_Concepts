package Recursion;

import java.util.*;

public class printNtimes {
    public static void fun(int i,int n){
        if(i>n){return;}
        System.out.println("Vishu");
        fun(i+1, n);
    }
    public static void main(String[]args){
      //taking input from the user
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of times you wnt to print the name:");
      int n=sc.nextInt();
        fun(1,n);
      sc.close();
    }
    
}
