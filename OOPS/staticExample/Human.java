package OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // long population;   // as population is common to all humans (or object of human class)
    //this is not an instance variable
    // so we will be defining it as static : can  access using "class name"
    static long population; // by default the value long is 0, so it is initialised as 0;
    public Human(int age, String name, int salary, boolean married ){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;


        // now we are going to access the static varibale
        // this.population+=1;  // shows warning: The static field Human.population should be accessed in a static way

        // so we are going to access it with "class name" (by convension)
        Human.population+=1;

        // now we can use population in Main.java
        


    }
    //now going to use this class in another file of same package which is" Main.java"
    
}
