import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int end;
        int payHour0 = 50;
        int payHour1 = 200;
        int limit = 250;

        do {
            System.out.println("Is the employee junior (press 0) or senior (press 1)?");
            int employee = scanner.nextInt();
            if (employee == 0 | employee == 1)
                System.out.println("How many hours did he worked this month?");
            else {
                System.out.println("This employee doesn't exist. Please try again.");
                break;
            }
            int hoursWork = scanner.nextInt();
            if (hoursWork > 0)
                System.out.println("In how many days he completed the daily goal?");
            else {
                System.out.println("That sound wrong :) why won't you try again?");
                break;
            }
            int dailyGoal = scanner.nextInt();
            if (dailyGoal < 0) {
                System.out.println("Something went wrong.(Yea.. im talking about you. no - in here..)");
                break;
            }
            details(employee,hoursWork,dailyGoal,payHour0, payHour1, limit);
            System.out.println("Dם you want to continue? press 1 for yes, 0 for no:");
            end = scanner.nextInt();
        } while (end == 1);

    }
            public static void details(int employee, int hoursWork, int dailyGoal,
                                       int payHour0, int payHour1, int limit)
            {
                if (employee == 0)
                    System.out.println(payHour0 * hoursWork + limit * dailyGoal);

                if (employee == 1)
                    System.out.println( payHour1 * hoursWork + limit * dailyGoal);
            }
        }