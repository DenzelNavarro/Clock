import java.util.*;

public class TestProgClock {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Clock myClock = new Clock(5, 4, 30);
        Clock yourClock = new Clock();

        int hours;
        int minutes;
        int seconds;

        System.out.print("myClock: ");
        myClock.printTime();
        System.out.println();
        System.out.print("yourClock: ");
        yourClock.printTime();
        System.out.println();

        yourClock.setTime(5, 45, 16);

        System.out.print("After setting the time, yourClock: ");
        yourClock.printTime();
        System.out.println();

        if (myClock.equals(yourClock))
            System.out.println("Both the times are equal.");
        else
            System.out.println("The two times are not equal.");

        System.out.print("Enter hours, minutes, and seconds: ");
        hours = console.nextInt();
        minutes = console.nextInt();
        seconds = console.nextInt();
        System.out.println();

        myClock.setTime(hours, minutes, seconds);

        System.out.print("New time of myClock: ");
        myClock.printTime();
        System.out.println();

        myClock.incrementSeconds();

        System.out.print("After incrementing the time by one second, myClock: ");
        myClock.printTime();
        System.out.println();

        yourClock.makeCopy(myClock);

        System.out.print("After copying myClock into yourClock, yourClock: ");
        yourClock.printTime();
        System.out.println();
    }
}
