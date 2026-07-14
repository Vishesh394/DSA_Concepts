package Linear_DS.Array.Topics;
import java.util.*;

// passing array to function: 
public class passingInFunctions {
    public static void main(String[] args) {
        int [] nums={3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    public static void change(int[] arr){
        arr[0]=99;
        
    }   
    
}
