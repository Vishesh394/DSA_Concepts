package Linear_DS.Array.Topics;

import java.util.*;


//MULTI-DIMENSIONAL ARRAYLIST: Array list of arraylists (just like array of arrays) 
public class MutiAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        //intialization 
        for(int i=0;i<3;i++){  // add 3 lists inside the list 
            list.add(new ArrayList<>());
        }

        //add element: 

        System.out.println("Enter the element in the list: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());   // geting the list from the list and adding the elements to them(just like in 2d array)

            }
        }

        //geting the output: 
        System.out.println(list);  //[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    sc.close();
        
    }
    
}
