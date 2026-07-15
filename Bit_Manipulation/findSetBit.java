package Bit_Manipulation;
public class findSetBit{
    public static int countSetBit(int n){
        int cnt=0;
       /*  while(n>1){
            if(n%2==1){
                cnt+=1;
            }
            n=n/2;
            if(n==1) {
                cnt+=1;
            }

            }
            return cnt;
            */
           //another method:2
          /*  while(n>1){
            cnt+=(n&1);
            n=n>>1;
            if(n==1){
                cnt++;
            }
           }
           return cnt;
           */
          //method:3  : best time complexity.
          while(n!=0){
            n=n&(n-1);
            cnt++;
            if(n==1) cnt++;
          }
          return cnt;
        }
    
    public static void main(String[] args) {
        int n=84;
        System.out.println("the set bit is: "+countSetBit(n));
        
    }
}