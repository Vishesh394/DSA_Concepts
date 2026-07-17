package Binary_sear;
import java.util.*;

public class NthRootofNum {
    public static int root(int n, int m){
        
        for(int i=0;i<=m;i++){
            long power=(long)Math.pow(i, n);
            if(power==m){
                return i;
            }
            if(power>m){
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N=sc.nextInt();
        System.out.println("ENter the value of M: ");
        int M=sc.nextInt();

        System.out.println("the nth root of number is: "+ root(N, M));
        sc.close();
    }

    
}
