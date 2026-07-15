package Bit_Manipulation;
class powerOf2{
    public static boolean isPowerOftwo(int n){
        if(n<=0){
            return false;

        }
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOftwo(n));
    }
}