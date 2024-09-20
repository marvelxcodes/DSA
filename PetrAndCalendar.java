import java.util.Scanner;

public class PetrAndCalendar {
    public static void main(String[] args) {
        int days = 31;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (m == 2) {
            days = 28;
        } else if (m % 2 == 0 && m < 7 || m % 2 == 1 && m > 7) {
            days = 30;
        }

        if (days == 30) {
            if (d <= 6) {
                System.out.println(5);
            } else {
                System.out.println(6);
            }
        } else if (days == 28) {
            if (d == 1) {
                System.out.println(4);
            } else {
                System.out.println(5);
            }
        } else {
            if (d <= 5) {
                System.out.println(5);
            } else {
                System.out.println(6);
            }
        }
    }
}
