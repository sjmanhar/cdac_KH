public class WrapperClassDemo {
    public static void main(String[] args) {
        // Integer to Double
        Integer intObj = 50;
        Double doubleObj = intObj.doubleValue();
        System.out.println("Integer to Double: " + doubleObj);

        // Double to Integer
        Double doubleVal = 75.25;
        Integer intVal = doubleVal.intValue();
        System.out.println("Double to Integer: " + intVal);
    }
}
