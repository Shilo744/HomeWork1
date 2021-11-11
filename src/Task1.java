import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

            System.out.println("The absolute value is " + (Math.abs(userInput)));
    }
}
