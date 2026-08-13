package OOPS.properties.Polymorphism;
// Polymorphism: ability of an object to take many forms

// 

// for example : 
/*
shapes- Base class
circle- derived class
square- derived class
triangle - derived class

let say if we have a method called area() in base class 
that area() method is overridden in the derived class circle, square and triangle.
so when we call the area() method using the object of base class then it will call the area() method of base class but if we call the area() method using the object of derived class then it will call the area() method of derived class.






 */

// Base class 
class shapes {
    void area() {
        System.out.println("THis is area of shapes");

    }
}

// Derived class : circle
class circle extends shapes {
    void area() {
        System.out.println("This is area of circle");
    }
}

// Derived class :
class triangle extends shapes {
    void area() {
        System.out.println("Area of Triangle");
    }
}

// derived class : square
class square extends shapes {
    void area() {
        System.out.println("Area of square");
    }
}

public class polymorphism {
    public static void main(String[] args){

        // taking reference of base class

        shapes s1= new shapes(); // object of base class
        s1.area(); // calling area() method of base class

        shapes s2=new circle();
        // calling area() method of derived class: circle
         s2.area();

        shapes s3 = new triangle();
        // calling area() method of derived class: triangle
        s3.area();

        shapes s4 = new square();
        // calling area() method of derived class: square
        s4.area();

        // refrence of derived classes with their own objects 

        circle c1= new circle(); // object of derived class circle
        c1.area(); // calling area() method of derived class circle

        triangle t1= new triangle(); // object of derived class triangle
        t1.area(); // calling area() method of derived class triangle  

        square sq1= new square(); 
        sq1.area(); // calling area() method of derived class square

                 




    }

}

/*
    OUTPUT : 
    THis is area of shapes
    This is area of circle
    Area of Triangle
    Area of square
    This is area of circle
    Area of Triangle
    Area of square

 */
