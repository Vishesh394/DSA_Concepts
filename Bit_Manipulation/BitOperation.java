package Bit_Manipulation;

public class BitOperation {
    //for checking set bit:
    public static boolean check(int n,int i){
        //using left shift operator:
        /*int mask=1<<i;
        if((n&mask)==0){
            return false;

        }
        else{
            return true;
        }*/
       //using right shift operator:
       int m=n>>i;
       if((m&1)==0){
        return false;
       }
       else{
        return true;
       }
    }
    //for setting a bit:
    public static int set(int n, int i){
        int mask=1<<i;
        return n|mask;
    }
    //clearing a bit:
    public static int clear(int n,int i){
        int mask=~(1<<i);
        return n&mask;
    }
    //toggle the ith bit:
    public static int toggle(int n,int i){
        int mask=1<<i;
        return n^mask;

    }
    public static void main(String[] args) {
        int n=6;
        int i=0;
        if(check(n,i)){
            System.out.println("Set bit");
        }
        else{
            System.out.println("Not set bit");
        }
        //setting a bit:
        int numSetbit=set(n,i);
        System.out.println("After setting bit:"+numSetbit);
        //clearing a bit:
        int numClearbit=clear(6,1);
        System.out.println("After clearing bit:"+numClearbit);
        //toggle a bit:
        int numTogglebit=toggle(6,0);
        System.out.println("After toggle:"+numTogglebit);
        




    }
    
}
