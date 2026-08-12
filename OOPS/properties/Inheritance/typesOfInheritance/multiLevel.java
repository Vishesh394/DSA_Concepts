package OOPS.properties.Inheritance.typesOfInheritance;
//Multilevel inheritance: a class is derived from a class which is already derived from another class 

class Box {
    double width, height, volume;

    Box(double w, double h, double v) {
        this.width = w;
        this.height = h;
        this.volume = v;
    }
}

class BoxWeight extends Box {
    double weight;
    // private double weight; // not acessible , only accessible in BoxWeight class

    BoxWeight(double w, double h, double v, double wt) {
        super(w, h, v);
        this.weight = wt;
    }
}

//BoxColor class is derived from BoxWeight class which is already derived from Box Class 
// so this is multilevel inheritance

class BoxColor extends BoxWeight {
    protected String color; // if i make it private then it will not be accessible in the main method

    BoxColor(double w, double h, double v, double wt, String c) {
        super(w, h, v, wt); //initialize the values present in the parent class i.e. BoxWeight and Box class
        this.color = c;  // initialise the varible present in the present class 
        
    }

}

public class multiLevel {

    public static void main(String[] args) {
        BoxColor boxColor = new BoxColor(10, 20, 30, 40, "Red");
        System.out.println("Width: " + boxColor.width);
        System.out.println("Height: " + boxColor.height);
        System.out.println("Volume: " + boxColor.volume);
        System.out.println("Weight: " + boxColor.weight);
        System.out.println("Color: " + boxColor.color);
    }
}
