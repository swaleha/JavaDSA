public class ClearRangeOfBits {

    public static int clearBitRange(int n, int i, int j){
        int a = (~0) << j+1;
        int b = (1<<i) - 1;
        int bitMask = a | b;

        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitRange(15, 0, 2));
    }
}
