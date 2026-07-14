package Linear_DS.Array.Topics;

import java.util.*;

public class ArrayListConcept {
    public static void main(String[] args) {
        // ARRAYLIST: class : member of the collection framework in java
        // collection : already written data structures : like Linkedlist, stacks,
        // hashmaos, sets.
        // Java provides the implementation of all the ds in collection framework.

        Scanner sc=new Scanner(System.in);
        // SYNTAX:
        ArrayList<Integer> list = new ArrayList<>(10);

        //add() function: 
        list.add(10);
        list.add(11);
        list.add(10);
        list.add(100);
        list.add(33);
        System.out.println("Initial list: "+ list);

        //set() function 
        list.set(0,99);
        System.out.println("After setting element at index 0 to 99: "+ list);

        //remove() function: 
        list.remove(2);
        System.out.println("After removing element from index 2: "+list ); 


        // ==taking input in ArrayList ===    

        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println("Enter the element in List2: ");
        for(int i=0;i<5;i++){
            list2.add(sc.nextInt());
        } 

        //get item at any index: 
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");  //pass index here , list[index] syntax will not work here.
        }

        System.out.println(list2); //[11, 12, 13, 14, 15]


    sc.close();
    }


}
