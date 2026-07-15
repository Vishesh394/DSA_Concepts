package Bit_Manipulation;

import java.util.*;
public class xor2nums {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the left(L): ");
        int l=sc.nextInt();
        System.out.println("Enter the right(R):");
        int r=sc.nextInt();
        int result = fun(l-1)^fun(r);
        System.out.println("the XOR of [L,R] is:"+ result);
        sc.close();


        //brute force 
    /*int l=4,r=6;
    int num=0;
    for(int i=l;i<=r;i++){
        num=num^i;
    }
    System.out.println("the xor of num:"+ num);*/

    
    }


    // optimal approach:
    public static  int fun(int n){
        if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;

        }
        else if(n%4==3){
            return 0;
        }
        return n;
    }



}
