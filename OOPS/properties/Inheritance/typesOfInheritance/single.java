package OOPS.properties.Inheritance.typesOfInheritance;

// Single Inheritance: one class extends another class 

//Base Class
class Box{
    double height;
    double width;
    double volume;

    Box(double h, double w,double v){
        this.height=h;
        this.volume=v;
        this.width=w;  
    }



}


//inherited class 
class BoxWeight extends Box{
    double weight;
    BoxWeight(double h, double w, double v, double wt){
        super(h,w,v);
        this.weight=wt;
    }
}


public class single {

    
}
