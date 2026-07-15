package Bit_Manipulation;

import java.util.*;

public class convert_DtoB {
    /*
     * public static String convertDecimalToBinary(int n) {
     * StringBuilder sb = new StringBuilder();
     * 
     * while (n > 0) {
     * if (n % 2 == 1) {
     * sb.append('1');
     * } else {
     * sb.append('0');
     * }
     * n = n / 2;
     * }
     * return sb.reverse().toString();
     * }
     */
    public static String convertDecimalToBinary(int n) {
        int binary = 0;
        int placeValue = 1;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * placeValue);
            placeValue = placeValue * 10;
            n = n / 2;
        }
        return String.valueOf(binary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        String binStr = convertDecimalToBinary(n);
        System.out.println("Decimal:" + n);
        System.out.println("Binary:" + binStr);
        sc.close();
    }
}



