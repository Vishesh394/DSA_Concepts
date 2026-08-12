package OOPS.properties.Inheritance.typesOfInheritance;
// Hierarchical inheritance: multiple classes are derived from a single parent class

/*
A -- B
  -- C
  -- D

ow here A is the parent class and B, C, D are the child classes. All the child classes inherit from the same parent class A.

B, C, and D can have access to the properties and methods of the parent class A.

but B, C, and D are independent of each other. They do not have access to each other's properties and methods.
 */

// Base Class
class Box {
    double width ,height, volume;
    Box(double w, double h, double v){
        this.width=w;
        this.height=h;
        this.volume=v;
    }
}


//fist derived class 
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double v, double wt){
        super(w,h,v);
        this.weight=wt;
    }
}

//second derived class 
class BoxColor extends Box{
    String color;
    BoxColor(double w, double h, double v, double wt, String c){
        super(w,h,v);
        this.color=c;
    }
}
public class hierarchial {

    
}
