import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int userInput2 = scanner.nextInt();
        if ((userInput1+userInput2)%2==0)
            System.out.println("The number is even");
        else System.out.println("The number is odd");
    }}