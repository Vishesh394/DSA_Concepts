package Bit_Manipulation;
import java.util.*;
public class swap2nums{
    public static void swap(int a,int b){
       /*  int temp;
        temp=a;
        a=b;
        b=temp;
        */
       //without using third variable:
        a=a^b;
        b=a^b;
        a=a^b;       
        System.out.println("After swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Before:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        swap(a, b);
        sc.close();



    }
}