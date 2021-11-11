import java.util.Scanner;
public class Task8 {
    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
        System.out.println("Enter a number from 5-20:");
        num = scanner.nextInt();
    }
        while (num<5|num>20);
        return num;

    }

public static void makeAsterisk(int num){

    int i, j;
    for (i = 0; i < num; i++)
    {
        for (j = 0; j <= i; j++)
        {
            System.out.print("*");
        }
        System.out.println();

}}
    public static void main(String[] args) {
        int num = getNumber();
        makeAsterisk(num);
    }
}