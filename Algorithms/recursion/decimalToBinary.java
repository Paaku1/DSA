package Algorithms.recursion;

public class decimalToBinary {
    public static void main(String[] args) {
        int decimal = 10;
        System.out.println(toBinary(decimal));
    }

    private static int toBinary(int n) {
        if(n==0){
            return 0;
        }
        return n%2 + toBinary(n/2)*10;
    }
}
