import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Month;


class ToWedding {
    LocalDateTime wedding = LocalDateTime.of(2019, Month.JUNE, 7, 16, 00, 00);
    LocalDateTime now = LocalDateTime.now();
    Duration duration;
    long days;
    long hours;
    long minutes;
    long seconds;

    public void toWedding() {
        duration = Duration.between(now, wedding);
        days = duration.toDays();
        System.out.println("Do ślubu zostało " + days + " dni");
    }
}