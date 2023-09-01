// Import required packages
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeExample {
  public static void main(String[] args) {
    // Get current date and time
    LocalDateTime current = LocalDateTime.now();
    System.out.println("Current Date and Time is: " + current);

    // Format date and time
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formatted = current.format(format);
    System.out.println("Formatted Date and Time is: " + formatted);
  }
}
