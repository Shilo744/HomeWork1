import java.util.Scanner;
import java.util.Random;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(1000) + 1;
        int player1;
        int player2;
        int numberTry1=1;
        int numberTry2=1;

        do {
            System.out.println("Player1 turn to guess the number:");
            player1 = scanner.nextInt();
            {
                 if (player1 == secretNumber)
                    System.out.println("player1 won after "+numberTry1+" tries.");
                if (player1==secretNumber)
                    break;
                else {
                    if (secretNumber > player1)
                        System.out.println("The secret number is bigger.");
                    else
                        System.out.println("The secret number is lower.");

                    numberTry1++;
                }
                System.out.println("Player 2 turn to guess the number:");
                player2 = scanner.nextInt();
                if (player2 == secretNumber)
                    System.out.println("player2 won after "+numberTry2+" tries.");
                {
                    if (secretNumber > player2)
                        System.out.println("The secret number is bigger.");
                    if (secretNumber < player2)
                        System.out.println("The secret number is lower.");
                    numberTry2++;

                    if (player2==secretNumber)
                        break;
                }
            }
        }   while (player1 != secretNumber && player2 != secretNumber) ;

        }
    }
