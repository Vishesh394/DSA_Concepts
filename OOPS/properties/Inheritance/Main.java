package OOPS.properties.Inheritance;

// using the box class in Main
public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.h + " " + box.w);  //-1.0 -1.0 -1.0


        Box box1=new Box(10.3, 4.5, 7.8);
        System.out.println(box1.l+" "+ box1.h+" "+ box1.w); // called the constructor with 3 para : 
                                                            // op: 10.3 4.5 7.8

        Box box2=new Box(box1);
        System.out.println(box2.l+" "+ box2.h+" "+ box2.w);  // copy the properties of box1 to box2
                                                            // op: 10.3 4.5 7.8
        box.information();    //OP: Running the Box


        BoxWeight box3=new BoxWeight();

        box3.Info();
        System.out.println(box3.l+" "+ box3.h+" "+ box3.w+" "+ box3.weight); //-1.0 -1.0 -1.0 -1.0

        BoxWeight box4= new BoxWeight(2,4,5,6);
        System.out.println(box4.l+" "+ box4.h+" "+box4.w+" "+ box4.weight);


        // reference variable and object 
        // 1. subclass ref var = subclass object : allowed 
        BoxWeight wb= new BoxWeight(2, 5,6,7);   // can access everthing present in subclass object.
        System.out.println(wb.h+" "+ wb.l+" "+ wb.w+" "+ wb.weight);  


        //2. subclass ref var = superclass object : not allowed 
        //there are many variable in both parent and child class
        // you are given access to only those variables that are in the ref type. i.e. BoxWeight.
        //hence, you should have aceess to weight variable
        // BoxWeight b1=new Box(1, 2, 5);   // it is not possible coz "Box" object doesnot have members 
                                            // which are needed here - weight?
        // BoxWeight b2=new Box(1, 2, 5,10);   // it is not possible coz "Box" object doesnot have any idea what is weight variable
                                               // which are needed here - weight?

        //3. superclass ref var = subclass object : can access only members of "Box".
        Box b3=new BoxWeight(2,3,4,5);
        System.out.println(b3.h+" "+ b3.l+" "+ b3.w);// executes 
        // System.out.println(b3.weight); //gives compile time error coz weight is not declared in "Box".
                                    //and The object is a BoxWeight, but Java checks member access using the reference type (Box), not the object type.  

        
        
                 
    }


}
