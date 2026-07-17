package OOPS;
// derived class constructor must called the super(base) class constructor
// if super class have parameterized constructor instead of default constructor 
// then derived class constructor called parametrized constructor of base class

public class InheritanceAndConstructor {
    public static void main(String[] args) {
        Derived d=new Derived();
        d.name="parameterized constructor";
    }
}
class Base{
    String name;
    // Base(){
    //     System.out.println("Base class Constructor called");
    // }
    // parametrized constructor of base class
    Base(String name){
        this.name=name;
        System.out.println("Paramtereized constructor of Base class called");

    }
}
class Derived extends Base{
    Derived(){
        super("KK");  // explicity calling the base class constructor: parameterized constructor
        // coz base class only have parameterized constructor
        //so we used super() : explicitly call the parametrized base class constructor.
        
           System.out.println("Derived class constructor called");
    }
}