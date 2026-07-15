package Bit_Manipulation;
import java.util.*;
public class convertBinary2Decimal {
    public static int convBtoD(String x ){
        int deciNum=0;
        int pow=1;
        for(int i=x.length()-1;i>=0;i--){
            if(x.charAt(i)=='1'){
                deciNum=deciNum+pow;
            }
            pow=pow*2;

        }
        return deciNum;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary String:");
        String s=sc.next();
        int deciNum=convBtoD(s);
        System.out.println("Decimal Number: "+deciNum);
        sc.close();
        
    }
}
