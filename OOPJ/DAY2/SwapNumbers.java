// 3. Java Program to Swap Two Numbers using and without using a Temporary Variable
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Using temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using temp variable): a = " + a + ", b = " + b);

        // Without using temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp variable): a = " + a + ", b = " + b);
    }
}