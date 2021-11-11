import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat;

            System.out.println("Enter the first number at your invoice series:");
            int firstNumber = scanner.nextInt();
            System.out.println("What the distance between each number?");
            int distance = scanner.nextInt();
        do {
            System.out.println("how many number do you want in your in your invoice series?");
            int amount = scanner.nextInt();
            details(firstNumber, distance, amount);
            {
                if (amount < 0)
                    System.out.println("This have to be a whole and positive number. please try again.");
            }
            repeat = amount;
        } while (repeat < 0) ;
    }

    public static void details(int firstNumber, int distance, int amount) {

        for(int i=0; i<amount; i++){
System.out.print(firstNumber+ ". ");
        firstNumber=firstNumber+distance;
    }}}