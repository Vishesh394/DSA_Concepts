package OOPS.properties.Inheritance;
// what if we will not use super keyword
// 1- we have to add a default constructor to superclass e.g. Box() constructor
class Box{
    double width;
    double height;
    double depth;
    Box(){ //default constructor
        System.out.println("Base class Constructor called: ");
    }

    Box(double w, double h, double d){  // parameterized constructor 
        this.width=w;
        this.height=h;
        this.depth=d;
    }


}

class BoxWeight extends Box{
    double weight;
    BoxWeight(double w,double h,double d, double wt){
        this.width=w;
        this.height=h;
        this.depth=d;
        this.weight=wt;

    }
    /*
    so above subclass constructor treated as: 
    BoxWeight(double w, double h, double d, double wt) {
    super();  // Java adds this automatically
    this.width = w;
    this.height = h;
    this.depth = d;
    this.weight = wt;
    }
     */

//therefore if we don't use super(w,h,d)-- then superclass constructor with parameter is not called 
// instead defalut super class constructor is called
}

/*
so, super(w,h,d); --> initialize the parent part of this object using these values 

AND

this.width=w;
this.height=h;
this.depth=d;

means initialize the inherited variables directly from the child class

 */
public class notUsingSuperKeyword {
    
}
