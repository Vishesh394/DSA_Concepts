package Linear_DS.Array.Questions;

public class twosum {
    public static int[] sumof2(int [] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1-1};
    }
    public static void main(String[]args){
        int[] nums={1,2,3,4,5};
        int target=6;
        System.out.println("the indices are: "+sumof2(nums,target));

    }
    
}
