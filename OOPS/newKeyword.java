package OOPS;
//does assigning one object to another will copy the data?
//actually not when we assign the object to another -->it copies the reference (the memory address) to that object.
//therfore the another(refrence of object ) will points to the previous one
public class newKeyword {

    public static void main(String[] args) {
        Student one= new Student();
        Student two=one;  // it is pointing to the same object in the heap where the "one" pointing

        one.name="Something soething";
        System.out.println(two.name); // give the same output as one.name will give
        
    }
    
}

class Student{
    int rno;
    String name;

    Student(){

    }
}
