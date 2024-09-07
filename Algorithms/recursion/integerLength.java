package Algorithms.recursion;

public class integerLength {
    public static void main(String[] args) {
        System.out.println(intLength(12345,0));
    }

    private static int intLength(int n,int sum) {
        if(n==0){
            return sum;
        }
        return intLength(n/10,sum+n%10);
    }
    
}
