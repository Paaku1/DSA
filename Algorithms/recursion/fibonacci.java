package Algorithms.recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n==1) return 1;
        else if(n==0) return 0;
        return fibo(n-2)+fibo(n-1);
    }
}
