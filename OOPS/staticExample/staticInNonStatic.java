package OOPS.staticExample;

public class staticInNonStatic {
    public static void main(String[] args) {

        // greeting(); // Cannot make a static reference to the non-static method greeting()
        // cannot use it coz it will ask for an object (or instance)
        //which is not yet declared

        
    }
    

    //this function is not dependent on objects
    static void func(){
        greeting(); // we can't use this boz it requires an instance
        //but the function we are using it in does not depend on instances

        //you cannot access non static stuff without referencing their instances in 
        //a static context

        // /hence, here I am refrencing it: 
        staticInNonStatic obj=new staticInNonStatic();
        obj.greeting();

    }


    // it is NON-STATIC: so we know that something which is not static belongs to an object(or instance )
    void greeting(){
        System.out.println("hello world");
    }
    
}
