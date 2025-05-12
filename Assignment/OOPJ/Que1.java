import java.util.Scanner;
public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: " + a + " and " + b);
        

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping: " + a + " and " + b);
        
        sc.close(); // Close Scanner to avoid resource leak
    }
}