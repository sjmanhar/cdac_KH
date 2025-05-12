/*
// Question 1: Grade Classification  

class Assignment_1 {
    public static void main(String args[]) {
        int i = 72;
        if (i >= 90) {
            System.out.print("A");
        } else if (i >= 80 && i < 90) {
            System.out.print("B");
        } else if (i >= 70 && i < 80) {
            System.out.print("C");
        } else if (i >= 60 && i < 70) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
*/

//que 2
/*


public class Assignment_1 {
    public static void main(String args[]) {
        int i = 72;
        int day = 2; // Input is 2

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.print("Day: ");
                switch (day) {
                    case 1: System.out.println("Monday"); break;
                    case 2: System.out.println("Tuesday"); break;
                    case 3: System.out.println("Wednesday"); break;
                    case 4: System.out.println("Thursday"); break;
                    case 5: System.out.println("Friday"); break;
                }
                System.out.println("It is a Weekday.");
                break;
            
            case 6: case 7:
                System.out.print("Day: ");
                switch (day) {
                    case 6: System.out.println("Saturday"); break;
                    case 7: System.out.println("Sunday"); break;
                }
                System.out.println("It is a Weekend.");
                break;
                
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}
*/
/*
// Question 3: Calculator
     
public class Assignment_1 {
    public static void main(String args[]) {
        int num1 = 5;
        char operator = '*';
        int num2 = 5;
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }
    }
}
*/
/*
//Question 4: Discount Calculation 

public class Assignment_1 {
    public static void main(String args[]) {
        double totalPurchase = 996; // Input is 996
        boolean hasMembership = false; // Assuming no membership card for this case
        
        double discount = 0;
        
        if (totalPurchase >= 1000) {
            discount = 20;
        } else if (totalPurchase >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }
        
        if (hasMembership) {
            discount += 5;
        }
        
        double finalPrice = totalPurchase - (totalPurchase * discount / 100);
        
        System.out.println("Total Purchase Amount: Rs." + totalPurchase);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Final Price after Discount: Rs." + finalPrice);
    }
}
*/
/*
//Question 5: Student Pass/Fail Status with Nested Switch

public class Assignment_1 {
    public static void main(String args[]) {
        int hindi = 56;
        int english = 37;
        int maths = 45;
        
        int failCount = 0;
        
        if (hindi <= 40) failCount++;
        if (english <= 40) failCount++;
        if (maths <= 40) failCount++;
        
        if (failCount == 0) {
            System.out.println("The student has passed all subjects.");
        } else {
            System.out.println("The student has failed in " + failCount + " subject(s).");
        }
    }
}


*/
