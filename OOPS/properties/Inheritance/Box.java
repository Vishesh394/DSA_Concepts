package OOPS.properties.Inheritance;

public class Box {

   // private double l; //this is private so, the child class will not be able to access this
    // we can use it only here , in this file
    double l;
    double w;
    double h;

    Box(){  //default contructor
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    

    //cube: 
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;

    }

    Box(double l, double h, double w){  // parameterized constructor
        this.l=l;
        this.h=h;
        this.w=w;
    }

    //copy constructor
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;

    }

    public void information(){
        System.out.println("Running the Box");
    }
}
