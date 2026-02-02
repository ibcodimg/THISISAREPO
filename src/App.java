import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number you wish to add: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number you wish to add: ");
        int num2 = scanner.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }
}
