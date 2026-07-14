package Linear_DS.Array.Topics;
// import java.util.*;

// 2d array with no fixed size of column: Dynamic array
public class colNotFixed {
    public static void main(String[] args) {
        int[][] arr={

            {1,2,3,4},
            {5,6},
            {7,8,9}

        };

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
         
    }
    
}
