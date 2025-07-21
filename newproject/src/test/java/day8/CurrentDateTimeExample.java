package day8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create a formatter for the desired date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");

        // Format the current date and time using the formatter
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the formatted date and time
        System.out.println("Current date and time: " + formattedDateTime);

}
}