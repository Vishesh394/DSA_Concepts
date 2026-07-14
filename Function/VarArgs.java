package Function;

//VARIABLE LENGTH ARGUMENTS (VARARGS) IN JAVA:
// In Java, variable-length arguments (varargs) allow a method to accept zero or more arguments of a specified type(e.g. string , int, char, etc).
// useful when we don't know how many arguments will be passed to the method.


public class VarArgs {
    
    public static void main(String[] args) {

        fun(1,2,3,4,5);

        fun("hello","world","java");

        fun(10,"apple","banana","cherry");
    }

// int array
    static void fun(int ...v){
        // v is an array of integers
        System.out.println(v.length);  // prints the number of arguments passed to the method
        for(int i:v){
            System.out.print(i+" ");
        }
    }

    


// array of type string 

    static void fun(String ...v){
        // v is an array of strings
        System.out.println(v.length);  // prints the number of arguments passed to the method
        for(String i:v){
            System.out.print(i+" ");
        }
    }

// multiple varargs in a method is not allowed, but we can have one varargs and other parameters in the method.
    static void fun(int a,String ...v){ // varargs should be the last parameter in the method
        System.out.println();
        // v is an array of strings
        System.out.println(a);
        System.out.println(v.length);  // prints the number of arguments passed to the method
        for(String i:v){
            System.out.print(i+" ");
        }
    }
    
}
