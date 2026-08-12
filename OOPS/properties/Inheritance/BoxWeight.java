package OOPS.properties.Inheritance;


// BoxWeight class Inherits the superclass Box: 
// coz it rwants everthing or every properties Box have : 

public class BoxWeight extends Box{

    double weight;

    public BoxWeight(){   //default constructor
        this.weight=-1;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h,w );  //what is this?? : saying call the parent class contructor
        //used to initialize the values of parent class 
        
        this.weight=weight;

    }

    public void Info(){
        System.out.println("THis is running BoxWeight");

    }


    
}
 