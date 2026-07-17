package OOPS;

// primitives cannot change once instanciated.
class Demo{
    final int x=10;
    void change(){
        // x=20; //The final field Demo.x cannot be assigned (compile time error).
    }
}

// final with a reference type: 
class Student{
    String name;
}


public class finalKeyword {

    public static void main(String[] args) {

        final Student s1=new Student();
        s1.name="KK";  // allowed : coz s1 is not an object , s1 is just a reference(address) to the object.
      /*   Reference Variable           Object in Heap
           ------------------           ------------------
            s  ----------------------->  Student
                                          name = "Rahul"
                              */

        // final keyword -> means refrence varible must always point to the same object 
        // doesnot means -> the object's data cannot change 
        System.out.println(s1.name); 


        // s1=new Student();  // ❌ not allowed : The final local variable s1 cannot be assigned. It must be blank and not using a compound assignment


    }


        
        
    }
    


