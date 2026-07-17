package OOPS;
public class manipulateObject {
    public static void main(String[] args) {

        Student s1;  //declaration of object of student class
        s1=new Student(); // initialization
        // System.out.println(s1);  //giving me some random value: OOPS.Student@36baf30c
       /*  System.out.println(s1.rno);// 0 -> coz it is  printing default value of roll no of s1(coz not yet inintialized)
        System.out.println(s1.name); // Null --> by default value of non-primitives
        System.out.println(s1.marks);// 0.0 --> default value
        */

       // now initalizing the instance varibales of object kunal
       /*s1.rno=13;
        s1.name="Kunal Khushwaha";
       s1.marks=92.4f;
       // now printing 
       System.out.println(s1.rno);   //13
       System.out.println(s1.name);  // Kunal Khushwaha
       System.out.println(s1.marks); // 92.4

       */

    



        
    }
    
}

class Student{
    int rno;
    String name;
    float marks;


 
}
