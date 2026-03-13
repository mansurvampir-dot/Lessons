package OOP.homeWork.Task3;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public void addSeconds(int n) {
        this.seconds += n;
        normalize();
    }

    private void normalize() {
        this.minutes += this.seconds / 60;
        this.seconds %= 60;
        this.hours += this.minutes / 60;
        this.minutes %= 60;
        this.hours %= 24;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
