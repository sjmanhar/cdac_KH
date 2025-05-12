public class LogicalOperators {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else {
            System.out.println(num + " is not positive or not even.");
        }
    }
}