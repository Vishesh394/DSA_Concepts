package OOPS;

public class Constructor {
   public static void main(String[] args) {

     Student s1=new Student();
     System.out.println(s1.rno);
     System.out.println(s1.name);
     System.out.println(s1.marks);

     Student s2=new Student(14, "Rahul", 84.5f);
     System.out.println(s2.rno);
     System.out.println(s2.name);
     System.out.println(s2.marks);
   }
}

class Student{
    int rno;
    String name;
    float marks;
    //we need a way to add the value of the above properties object by object

    //we need one word to access every object
    Student(){
        System.out.println("Constructor called: ");
        // this --> will be replaced with --> name of the reference variable when the function invoked.
        this.rno=13;
        this.name="KK";
        this.marks=84.5f;
    }

    // //parameterised constructor
    Student(int rno, String name, float marks){
        System.out.println("PArameterised Constructor called: ");  
        this.rno=rno;  // this.rno --> variable of object  that invoked the constructor(e.g. s1.rno)
        // rhs( i.e rno) --> the parameter that is passing in constructor while invoking
        this.name=name;
        this.marks=marks;

    }

}

//Constructor overloading: process of defining multiple constructor in the same class with different parameters.
// allowing objects to be initialized in different way
