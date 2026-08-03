package OOPS.staticExample;


// this is a demo to show inintialization of static varibles

public class staticBlock {
    static int a=4;
    static int b;

    static {
        System.out.println("I am in static block");
    }
    
    public static void main(String[] args) {
        staticBlock obj= new staticBlock();
        System.out.println(staticBlock.a+" "+ staticBlock.b);
        staticBlock.b+=3;

        System.out.println(staticBlock.a+" "+ staticBlock.b);
           

    }
}
