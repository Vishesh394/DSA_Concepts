package OOPS;
// import java.util.*;

// finalize() method: 
   /*  The finalize( ) Method:
Sometimes an object will need to perform some action when it is destroyed.
To handle such situations, Java provides a mechanism called finalization. By using finalization,
you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
To add a finalizer to a class, you simply define the finalize( ) method. The Java run time calls that method whenever
it is about to recycle an object of that class. Right before an asset is freed, the Java run time calls the finalize( )
method on the object.
*/

// depends on JVM whether it will run or not , called by JVM not programmer.


class Student{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed");
    }
}

public class finalizeMethod {
    public static void main(String[] args) {
        Student s1= new Student();
        s1=null;  // object eligible for GC
        System.gc();  //Request garbage collection 

        System.out.println("End of main");
    }

//output: End of main 
//        Object is being destroyed
// note: the above output is not guaranteed    
}
