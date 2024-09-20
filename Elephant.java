import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int reminder = x;

        if (reminder != 0) {
            reminder = x % 5;
            x = x / 5;
        }

        reminder = x % 4;
        x = x / 4;

        reminder = x % 3;
        x = x / 3;

        reminder = x % 2;
        x = x / 2;

        reminder = x % 1;
        x = x / 1;
    }
}
