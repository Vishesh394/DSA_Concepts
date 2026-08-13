package OOPS.properties.Polymorphism.typesofPolymorphism;

// compile time polymorphism or static polymorphism or method overloading:
// compile time polymorphism is achieved by method overloading and operator overloading

// method overloading: same method name but different parameters
// for example : multiple constructors with same name but different parameters
class Numbers{

    // method to add two numbers
    int sum(int a, int b){
        System.out.println("The sum of two numbers: ");
        return a+b;
    }

// method to add three numbers       
    int sum(int a, int b, int c){
        System.out.println("The sum of three numbers: ");
        return a+b+c;

    }


    
}
public class compileTime {
    public static void main(String[] args) {
        Numbers n1= new Numbers();
        System.out.println(n1.sum(3,4));
        System.out.println(n1.sum(3,4,5));
        
    }
    
}

/*
so at compile time, the compiler determines which method to call based on the number and type of arguments passed to the method. This is known as static polymorphism because the method to be called is determined at compile time.
 */
