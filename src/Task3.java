import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int userInput2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int userInput3 = scanner.nextInt();
        if (userInput1 < userInput3 && userInput2 < userInput3)
            System.out.println(Math.min(userInput1, userInput2));
        else System.out.println(userInput3);

        if (userInput1 > userInput2 && userInput1 < userInput3)
            System.out.println(userInput1);
        else if (userInput1 > userInput3) if (userInput1 < userInput2)
            System.out.println(userInput1);

        if (userInput2 > userInput1 && userInput2 < userInput3)
            System.out.println(userInput2);
        else if (userInput2 > userInput3 && userInput2 < userInput1)
            System.out.println(userInput2);

        if (userInput3 > userInput1 && userInput3 < userInput2)
            System.out.println(userInput3);
        else if (userInput3 > userInput2 && userInput3 < userInput1)
            System.out.println(userInput3);

        if (userInput1 > userInput3 && userInput2 > userInput3)
            System.out.println(Math.max(userInput1, userInput2));
        else System.out.println(userInput3);
    }}