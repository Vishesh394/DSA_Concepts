package Binary_sear;
import java.util.*;

public class sqrtOfNum {
    // Brute Force
    /*public static int sqrt(int n){
        int ans=0;
        for(int i=1;i<n;i++){
            if((long)i*i<=n){
                ans=i;
            }
            else{
                break;
            }
        }

        return ans;
    }*/

   //optimal approach: Binary search 
    public static int sqrt(int x){
        int ans=0;
        int l=1;
        int r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid<=x){
                ans=(int) mid;
                l=mid+1;

            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        System.out.println("the square root of number is: "+ sqrt(n));
        in.close();



    }
    
}
