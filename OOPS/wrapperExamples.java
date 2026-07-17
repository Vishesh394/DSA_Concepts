package OOPS;
import java.util.*;

public class wrapperExamples {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    // Integer num = new Integer(45);  // num --> an object
    //     System.out.println(num);
    //     System.out.println(num.bitCount(43));


    
    System.out.println("Enter two numbers: ");
    Integer n=in.nextInt();
    Integer m=in.nextInt();

    //comparing two numbers: compareTo() --
    // 0 --> if both equal
    // -1 --> if n is less than argument given
    // 1  --> if n is greater than argument given

    System.out.println(n.compareTo(m)); 


//convert to string: 
    System.out.println(n.toString());

    
// reverse(n): revese the bits of an integer
// not the digit
int rev=Integer.reverse(n);
System.out.println("Reverse of the bit: "+ rev);


    }

    
}
