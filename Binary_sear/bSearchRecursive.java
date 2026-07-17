package Binary_sear;

public class bSearchRecursive {

    public static int fun(int []arr, int low,int high, int target){
        if (low>high) {
            return -1;     
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid]<target) {
            return fun(arr, mid+1, high, target);
            
        }
        return fun(arr, low, mid-1, target);
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6};
        int low=0;                      
        int high=arr.length-1;
        System.out.println("the target is found at"+ fun(arr, low, high, 2));
        }
}
