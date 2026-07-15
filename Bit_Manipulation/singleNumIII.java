package Bit_Manipulation;
import java.util.*;
public class singleNumIII {
    public List<Integer> singleNum(int []arr){
        List<Integer> result=new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<>();

        //adding the key and values in the hash
        for(int num:arr){ 
            map.put(num,map.getOrDefault(num,0)+1);

        }
        //iterate the map 
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){   //if entry value is =1 
                result.add(entry.getKey()); //add the value to the result list
            }
        }
        Collections.sort(result); // sorting before the return
        return result;

    }
    public static void main(String[]args){
        int[] nums={1,2,1,3,5,5,6};
        singleNumIII sol=new singleNumIII();
        List<Integer> ans= sol.singleNum(nums);
        System.out.println("the single nums is given in array are: "+ ans.get(0)+" and "+ ans.get(1));

    }
}
