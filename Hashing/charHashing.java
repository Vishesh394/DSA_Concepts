package Hashing;
import java.util.*;

public class charHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//taking input for char array:
        System.out.println("Enter the String: ");
        String str=sc.next();
        char [] arr=str.toCharArray();

        System.out.println("The array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
// precomputation
        System.out.println("Stroed the value in HashMap");
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
//iterating map:
        System.out.println("The HashMap is: ");
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }

//taking queries:
        System.out.print("Enter the number of queries: ");
        int q=sc.nextInt();
        while(q-->0){
            System.out.print("Enter character: ");
            char ch=sc.next().charAt(0);
            //fetching 
            System.out.println("Frequency: "+ map.get(ch));
        }

        sc.close();
        
    }
    
}
