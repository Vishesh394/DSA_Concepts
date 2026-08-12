package Hashing;
import java.util.*;
public class Hash {
    public static void main(String [] args){
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("Eng",45); //put function
        map.put("Hind",56);
        map.put("Aus",43);
        map.put("Nor",57);
        map.put("USA",54);
        System.out.println(map); //printing the whole map
        System.out.println("the value : "+ map.get("Hind")); //get function: for access the value
        System.out.println("value removed"+map.remove("Hind")); // remove function: for removing an item 
        map.clear();
        System.out.println("the hash is empty/cleared");
        System.out.println("current hash:"+map);
        
        //to find the size of hash:
        int s=map.size();
        System.out.println("the size of hash is:"+s );

        map.put("Aus",43);
        map.put("Nor",57);
        map.put("USA",54);
        // loop through a HashMap: with a for-each loop:
        System.out.println("The current key set in hash is:");
        for(String i: map.keySet()){
            System.out.println(i);
        }
        System.out.println("the current values:");
        for(Integer i: map.values()){
            System.out.println(i);
        }

        //printing both keys and values:
        System.out.println("the keys and vaues are:");
        for(String i:map.keySet()){
            System.out.println("key: "+i+", value: "+map.get(i));
        }


        //getOrDefault: return the value of the entry in the map which has a specified key.
        //if the entry does not exist then the value of second parameter is returned.
        System.out.println(map.getOrDefault("eng", null));

        //entry set : return all the key value in the hashMap
        System.out.println(map.entrySet());
        

    }    
}
