package Recursion;

public class basicRecur {
    //stack overflow condition
    /*public static void print(){
        System.out.println(1);
        print();
    }*/
   
   //also gives infinite recursion (stack overflow condition)
   /*public static void count(int i){
    System.out.println(i);
    i++;
    count(i);
   }*/

  //Now adding base case for stopping the infinite condition.
  public static void count(int i){
    if(i==4){
        return;
    }
    System.out.println(i);
    i++;
    count(i);
  }
    public static void main(String []args){
       /* System.out.println("the infinite printing of 1 is started:");
        print();
         */
       /* System.out.println("this will print infinite count(until stack overflow condition occurs):");
        count(0);
         */

        System.out.println("the recursive call ends on base condition: ");
        count(0);


    }
    
}
    

