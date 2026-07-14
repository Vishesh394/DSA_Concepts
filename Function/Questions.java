package Function;

import java.util.*;

public class Questions {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        sc.close();

    }
// prime or not
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
        
    }


// print all the three digit armstrong numbers 
    // static int armstrong(int a){


    // }


// check armstrong numbers: sum of cubes of individual digit is equal to the given number
 

    
}
