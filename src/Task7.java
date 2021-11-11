import java.util.Scanner;
//
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("At what day would you want to make un appointment?");
            int dayAsk = scanner.nextInt();
            if (dayAsk >= 1 && dayAsk <= 5)
                System.out.println("What the earliest time you can arrive?");
            else {
                if (dayAsk == 6 || dayAsk == 7)
                    System.out.println("The office is close at the weekend.");
                else
                    System.out.println("Please write a valid day. (or ask god to make more days every week..)");
                break;
            }
            int earlyTime = scanner.nextInt();
            if (earlyTime < 24 && earlyTime > -1)
                System.out.println("What the latest time you can arrive?");
            else {
                System.out.println("the time you choose doesn't exist. Please try again.");
                break;
            }
            int lateTime = scanner.nextInt();
            if (lateTime <= 24 && lateTime >= 0)
                System.out.print("");
            else {
                System.out.println("the time you choose doesn't exist. Please try again.");
                break;
            }
            if (lateTime > earlyTime)
                System.out.print("");
            else {
                System.out.println("The late time come after the early time..");
                break;
            }
            {
                if (dayAsk !=3 && earlyTime >=9)
                    System.out.println("you can arrive at "+earlyTime);
                if (dayAsk !=3 && lateTime < 17)
                    System.out.println("you can arrive at "+ lateTime);
                else if (dayAsk !=3 && earlyTime<9 && lateTime>=17)
                    System.out.println("The office is open between 9:00-17:00");
            }
            {
            if (dayAsk == 3 && earlyTime>=8)
                System.out.println("you can arrive at "+earlyTime);
            if (dayAsk == 3 && lateTime<12)
                System.out.println("you can arrive at "+ lateTime);
            else if (dayAsk == 3)
                System.out.println("The office is open between 8:00-12:00");
            }
    } while (0 != 0);
        }
        }
