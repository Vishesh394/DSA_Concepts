package OOPS.properties.Polymorphism.typesofPolymorphism;


// Runtime polymorphism or dynamic polymorphism or method overriding:
// runtime polymorphism is achieved by method overriding

// method overriding: same method/function name and same parameters in both base class and derived class
// for example :


class shapes{
    void area(){
        System.out.println("This is area of shapes");
    }
}

class circle extends shapes{
    
    //this method will run when abj of circle class is created

    // hence it is overriding the area() method of base class shapes

    @Override // this is called annotation 
    // is used to tell the compiler that this method is overriden 
    // this annotation is optional but it is a good practice to use it
    // basically to check if the method is overriden or not and if it is not overriden then it will give an error
    void area(){
        System.out.println("This is area of circle");
    }
}
public class runtime {
    public static void main(String[] args) {
        
        shapes s1 = new shapes();
        s1.area();

        shapes s2 = new circle();
        // this will call the area() method of circle class because the object is of circle class
        s2.area(); 
        // overriding the area() method of base class shapes


        
    }
}
/*

Parent obj= new child(); // this is called upcasting

here, which method will be called is determined by type of child class object at runtime, 
not by type of parent class reference variable at compile time. This is known as dynamic polymorphism because the method to be called is determined at runtime.

this is known as upcasting because we are creating an object of child class and assigning it to a reference variable of parent class.



 */

// how determined at runtime which method to call?
// with dynamic method dispatch, the method to be called is determined at runtime based on the type of object that is being referred to by the reference variable.
