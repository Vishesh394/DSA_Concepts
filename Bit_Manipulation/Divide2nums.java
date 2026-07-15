package Bit_Manipulation;

public class Divide2nums {
    //divide two nums without using the division and multiplication 
    // method first: by subtracting the numbers until it becomes less than the divisor 
   public static int div(int dividend, int divisor){
     int count=0;
     
    while(dividend>=divisor){
        dividend=dividend-divisor;
        count++;
    }
    return count; 

    //GIVING TIME LIMIT ERROR 
    
   }
   public static void main(String[]args){
    int dend=10;
    int dsor=-3;
    System.out.println("The answer is:"+ 
    div(dend, dsor));

   }


}
