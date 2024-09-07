package Algorithms.recursion;

public class countBits {
    public static void main(String[] args) {
        System.out.println(count(10)); // Output: 2
    }

    private static int count(int i) {
        if(i==0){
            return 0;
        }
        if((i&1)==1){
            return 1+count(i>>1);
        }
        return count(i>>1);
    }
}
