package OOPS.packages.a;

import static OOPS.packages.b.Message.message;
public class greeting {
    public static void main(String[] args) {
        System.out.println("using function by importing package from a package and Message class and message function");
        message(); // this method is in Message file of package b
    }
}
