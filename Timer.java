public class Timer {
    private long seconds;
    private long minutes;
    private long hours;

    public Timer() {
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
    }
    
    public Timer(long hours, long minutes, long seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick() {
        this.seconds++;
        if (this.seconds == 60){
            this.minutes++;
            this.seconds = 0;
        }
        if (this.minutes == 60){
            this.hours++;
            this.minutes = 0;
        }
    }
}