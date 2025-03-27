// 1. Java Program for Implicit and Explicit Type Casting
public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit type casting (Widening)
        int intVal = 100;
        double doubleVal = intVal;
        System.out.println("Implicit Casting (int to double): " + doubleVal);

        // Explicit type casting (Narrowing)
        double doubleNum = 99.99;
        int intNum = (int) doubleNum;
        System.out.println("Explicit Casting (double to int): " + intNum);
    }
}
