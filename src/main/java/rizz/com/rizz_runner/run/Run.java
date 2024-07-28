package rizz.com.rizz_runner.run;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location location) {

    public Run {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        if (title == null) {
            throw new IllegalArgumentException("title cannot be null");
        }
        if (startedOn == null) {
            throw new IllegalArgumentException("startedOn cannot be null");
        }
        if (completedOn == null) {
            throw new IllegalArgumentException("completedOn cannot be null");
        }
        if (miles == null) {
            throw new IllegalArgumentException("miles cannot be null");
        }
        if (location == null) {
            throw new IllegalArgumentException("location cannot be null");
        }
    }
    
}
