public class DoubleToInt {
    public static void main(String[] args) {
        double num = 99.99;
        int converted = (int) num; // explicit typecasting
        System.out.println("Double value: " + num);
        System.out.println("Converted int value (data loss occurs): " + converted);
    }
}