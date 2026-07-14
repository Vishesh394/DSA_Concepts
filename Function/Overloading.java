package Function;

// Function overloading in Java:
// feature in java that allows us to have more than one method of same name in a class
//but with different parameters(diff types or diff number of para).

public class Overloading {

    public static void main(String[]args){
        fun(10);  //calls the method with one int parameter
        fun(10,20);  //calls the method with two int parameters
        fun("Hello Java"); // calls the method with string parameter

    }
    static void fun(int a){
        System.out.println(a);
        
    }

    static void fun(int a, int b){
        System.out.println(a+b);

    }
    static void fun(String s1){
        System.out.println(s1);
    }
}
