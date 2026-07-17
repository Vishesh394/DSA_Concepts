package OOPS;
// Chaining in Constructor using this()
// instead of writing the same initialization code multiple times, one constructor can call another using this().
//this() calls another constructor in the same class.
// It must be the first statement inside a constructor.
public class constructorChaining {
    public static void main(String[] args) {
        Student s1=new Student(); //calling the default constructor(with no-parameters)
        System.out.println(s1.rno+" "+ s1.name+" "+ s1.marks);
    
        Student s2=new Student(13); // calling the constructor with one parameter.
        //then this() function: calling the 3-parameter constructor but using from user
        System.out.println(s2.rno+" "+ s2.name+" "+ s2.marks);

        Student s3=new Student(14, "KK", 94.8f);  //calling 3-parameter constructor
        System.out.println(s3.rno+" "+ s3.name+" "+ s3.marks);

    }
    
}

class Student{
    int rno;
    String name;
    float marks;


    Student() {
        this(0, "Unknown", 0.0f);   // Calls the 3-parameter constructor
    }

    Student(int rno) {
        this(rno, "Unknown", 0.0f);  // this also calls the 3-para constructor
    }

    Student(int rno, String name, float marks) { // 3-para constructor
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

