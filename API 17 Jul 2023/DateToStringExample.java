// Import required packages
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringExample {
  public static void main(String[] args) {
    // Create a Date object
    Date date = new Date();
    System.out.println("Date object is: " + date);

    // Create a SimpleDateFormat object with the desired pattern
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
    // Convert the Date object to a String object using the format() method
    String formatted = format.format(date);
    System.out.println("Formatted date is: " + formatted);
  }
}
