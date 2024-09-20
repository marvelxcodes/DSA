import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int hour, min;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int newMinute = sc.nextInt();

        hour = Integer.parseInt(str.split(":")[0]);
        min = Integer.parseInt(str.split(":")[1]);

        min = min + (newMinute % 60);
        hour = hour + (newMinute / 60);


        if (min > 59) {
            min = min % 60;
            hour = hour + (min / 60);
        }
        if (hour > 23) {
            hour = hour % 24;
        }
        System.out.print((hour < 10 ? "0" + hour: hour) + ":");
        System.out.print((min < 10 ? "0" + min: min));
    }
}
