package Binary_sear;
// import java.util.*;
public class search {
        public static int Binarysear(int [] arr,int target){
            int low=0;
            int high=arr.length;
            while (low<=high) { 
                int mid=(low+high)/2;
                if(mid==target){
                    return mid;
                }
                if (arr[mid]<target) {
                    low=mid+1;  
                }
                else{
                    high=mid-1;
                }
                
            }
            return -1;
        }
        public static void main(String[] args){
            int[] arr={1,2,4,5,7};
            System.out.println(Binarysear(arr, 0));
        }
    
}


//find first transition.

