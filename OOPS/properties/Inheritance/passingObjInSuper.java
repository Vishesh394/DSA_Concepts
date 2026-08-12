package OOPS.properties.Inheritance;
//Passing an object to super()

class Box {  //superclass
    private double width;
    private double height;
    private double depth;

    // contructor clone of an object
    //or Copy constructor

    Box(Box obj){
        this.width=obj.width;
        this.height=obj.height;
        this.depth=obj.depth;
    }
}

//subclass
class BoxWeight extends Box{
    double weight;
    
    BoxWeight(BoxWeight ob){
        super(ob);  // passing an object of type : BoxWeight
                    // to superclass constructor Box(Box obj) -- this is VALID
        weight=ob.weight;
    }
}



public class passingObjInSuper {

}
