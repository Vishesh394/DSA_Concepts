package Recursion;
import java.util.*;

public class palindrome {
    //using brute force: tc=O(n) , sc=O(1)
    /* 
    public static boolean isPalOrNot(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            //non aphanumeric character:(LEFT)
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // checking for non alphanumeric char(RIGHT)
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //if characters are different then it is not palindrome.
            else if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                //move toward the middle part of the string.
                left++;
                right--;

            }
        }
        // if chars are same then return true.
         return true;
    }
    */

   //using optimal approach: RECURSION
   public static boolean isPalOrNot(int i, String s){
        // check if the half length done or not.
        if(i>=s.length()/2){
            return true;
        }
        //checks first and last character.
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return isPalOrNot(i+1, s);
   }


    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Is given string Palindrome: "+ isPalOrNot(0,str));
        sc.close();

        
    }

    
}
