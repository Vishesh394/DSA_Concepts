package Function;

public class blockScope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
        //    int  a=78;  // a is already initialized outside the block in the same method, hence can't be change again.
        //but we can change the value 
        a=100;  // reassign the **original ref varible** to some other value.
        System.out.println(a);  //100 
        int c=99;

        }
        // System.out.println(c); // givess error coz c cannot be used outside the block in which it was inintialised



// scoping in for loop 
for(int i=0;i<4;i++){
    System.out.println(i);

    int num=90;
    a=10000;
     

} 
    }

}
