package Function;
// shadowing in java: a practice of using two variables with the same name in different scopes
// in this case the variable which is declared in the inner scope will shadow the variable which is declared in the outer scope.
public class shadowing {
    static int x=90; // available inside the every scope 
    // this x will be shadowed by x=40 inside main block 

    public static void main(String[] args) {
        System.out.println(x); //90 
        int x=40;  // class variable x is shadowed by this local variable x=40
        System.out.println(x); //40 
        fun();  // 90
        
    }
    static void fun(){ // this function is in the same class as main method, so it can access the static variable x=90
        System.out.println(x);  // return 90
    }    
}
