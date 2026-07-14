package Function;

import java.util.*;

public class scope {

    // if we define a variable inside a function-> scope of that variable is only inside function 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);

        sc.close();

    }

    public static void swap(int num1, int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1+" "+ num2);

        // this change will only be vlid in this function scope only.

    }
    
}
