public class Clock {
    private int hr;
    private int min;
    private int sec;

    public Clock() {
        setTime(0, 0, 0);
    }

    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds) {
        hr = (hours >= 0 && hours < 24) ? hours : 0;
        min = (minutes >= 0 && minutes < 60) ? minutes : 0;
        sec = (seconds >= 0 && seconds < 60) ? seconds : 0;
    }

    public int getHours() {
        return hr;
    }

    public int getMinutes() {
        return min;
    }

    public int getSeconds() {
        return sec;
    }

    public void printTime() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

    public void incrementSeconds() {
        sec++;
        if (sec > 59) {
            sec = 0;
            incrementMinutes();
        }
    }

    public void incrementMinutes() {
        min++;
        if (min > 59) {
            min = 0;
            incrementHours();
        }
    }

    public void incrementHours() {
        hr++;
        if (hr > 23) hr = 0;
    }

    public boolean equals(Clock otherClock) {
        return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
    }

    public void makeCopy(Clock otherClock) {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

    public Clock getCopy() {
        return new Clock(hr, min, sec);
    }
}