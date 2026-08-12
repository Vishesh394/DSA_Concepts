package Recursion;

public class factorial {
    //Brute force:
    /*public static int fact(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }*/
   //recursive approach:
   public static int fact(int n ){
    if(n==0||n==1){
        return 1;

    }
    return n*fact(n-1);
   }
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.print("Enter the number for factorail: ");
        int n=sc.nextInt();
        System.out.print("the factorial of the number "+n+" is: "+ fact(n));
        sc.close();


    }
    
}
