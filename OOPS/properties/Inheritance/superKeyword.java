package OOPS.properties.Inheritance;
//super() keyword: 

class Box{
    double width;
    double height ;
    double depth;

    //constructor of Box class (superclass)
    Box(double w, double h, double d){
        this.width=w;
        this.height=h;
        this.depth=d;

    }
}

class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h,double d,double wt){
        super(w,h,d); // calls the superclass constructor...
        this.weight=wt;  // this.weight -> instance variable of current object 
                        // wt -> the constructor parameter
    }
}
public class superKeyword {
    
}
