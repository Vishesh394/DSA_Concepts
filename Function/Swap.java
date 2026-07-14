package Function;

public class Swap {
    public static void main(String[] args) {
        int a=20;
        int b=15;
        swap(a, b);
        System.out.print(a);
        System.out.println(b);
        
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

    }

    
}
