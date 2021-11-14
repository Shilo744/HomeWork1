import java.util.Scanner;
public class Task9 {
    public static boolean division(int num1, int num2) {
        boolean divide = (num1 % num2 == 0);
        return divide;

    }

    public static boolean prime(int num1) {
        for (int num2 = 2; num2 < num1; num2++) {
            if (division(num1, num2)) {
                return false;
            }
        }
        return true;

    }

    public static int number() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number:");
            num = scanner.nextInt();
        } while (num <= 0);
        return num;
    }

    public static void main(String[] args) {
        int number = number();
        for (int num2 = 2; num2 < number; num2++) {
            boolean isPrime = prime(num2);
            if (isPrime) {
                System.out.println(num2);
            }
        }
    }
}
