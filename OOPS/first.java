package OOPS;
import java.util.*;
public class first {
    public static void main(String[] args) {
        //store 5 roll nos.
        // int[] numbers=new int[5];  //every single element is number

        //stores 5 names
        // String[] names=new String[5]; //every single element is name

        //data of 5 students: {rollno, name, marks}
        //here is want to some sort of data structure in which every single element contains these three things
       /*  int[] rno= new int[5];
        String[] name= new String[5];
        float[]marks= new float[5];
        */


        // this is where classes and oops comes into play
        //#CLASS : Named group of properties and function.
        //by convention: class starts with a capital letter.
        Student[] students= new Student[5];

        //creating one student fist:  
        // Student kunal=new Student();
        // kunal.rno=1;
        // kunal.name="kunal";
        // kunal.marks=95.5f;

        System.out.println(Arrays.toString(students)); //[null, null, null, null, null]
    }

    //create a class: 
    //its like a datatype for everysingle student.<
    static  class Student{
        int rno;
        String name;
        float marks;
    }    
    
}
