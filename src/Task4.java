
import java.util.Scanner;
import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        int d = -b;
        double sqrt = sqrt((b*b) -4*a*c);
        int f = (2*a);
        double g = ((b*b) -4*a*c);
        if (g<0)
            System.out.println("There is no result");
        else
        System.out.println("x1 = " + (d+sqrt)/f);
        if (g>0)
        System.out.println("x2 = " + (d-sqrt)/f);

    }}