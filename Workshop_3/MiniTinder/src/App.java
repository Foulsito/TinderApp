import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to display the menu until the user decides to exit
        while (true) {
            // Display the menu options
            System.out.println("Select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            // Read the option selected by the user
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline to avoid errors

            if (option == 1) {
                // Register a new user
                System.out.print("Name: ");
                String name = scanner.nextLine(); // Read the name
                System.out.print("Email: ");
                String email = scanner.nextLine(); // Read the email
                System.out.print("Password: ");
                String password = scanner.nextLine(); // Read the password
                System.out.print("Birthday (YYYY-MM-DD): ");
                String birthdayInput = scanner.nextLine(); // Read the birthday
                LocalDate birthday = LocalDate.parse(birthdayInput); // Convert the birthday to LocalDate

                // Call the static method in User to register the user
                String result = User.register(name, email, password, birthday);
                System.out.println(result); // Display the result (success or error)
            } else if (option == 2) {
                // Login
                System.out.print("Email: ");
                String email = scanner.nextLine(); // Read the email
                System.out.print("Password: ");
                String password = scanner.nextLine(); // Read the password

                // Call the static method in User to log in
                String result = User.login(email, password);
                System.out.println(result); // Display the result (success or error)
            } else if (option == 3) {
                // Exit the program
                System.out.println("Goodbye!");
                break; // Break the infinite loop
            } else {
                // If the user selects an invalid option
                System.out.println("Invalid option.");
            }
        }
    }
}