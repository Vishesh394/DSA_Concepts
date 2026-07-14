package Linear_DS.Array.Questions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println("THe reversed array is: "+ Arrays.toString(reverse(arr)));

    }
    public static int[] reverse(int [] a){
        int p1=0, p2=a.length-1;  // took pointers here

        while(p1<p2){ 
                int temp=a[p1];
                a[p1]=a[p2];
                a[p2]=temp;
                p1++;
                p2--;

        }
        return a;
    }
    
}
