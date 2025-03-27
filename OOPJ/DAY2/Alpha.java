import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Consonant");
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }
        sc.close();
    }
}