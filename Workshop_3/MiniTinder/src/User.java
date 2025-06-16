import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    // Attributes for each user (name, email, birthday, password)
    public String name; // User's name
    private String email; // User's email (private to prevent direct access)
    public LocalDate birthday; // User's birthday
    private String password; // User's password (also private)

    // Static list to store all registered users
    private static List<User> users = new ArrayList<>();

    // Constructor: Used to create a new user with their data
    public User(String name, String email, String password, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
    }

    // Getter for email: Allows access to the user's email
    public String getEmail() {
        return email;
    }

    // Setter for email: Allows modification of the user's email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for password: Allows access to the user's password
    public String getPassword() {
        return password;
    }

    // Setter for password: Allows modification of the user's password
    public void setPassword(String password) {
        this.password = password;
    }

    // Static method to register a new user
    public static String register(String name, String email, String password, LocalDate birthday) {
        // Loop through the list of users to check if the email is already in use
        for (User user : users) {
            if (user.getEmail().equals(email)) { // If the email is found, registration fails
                return "Error: The email is already in use.";
            }
        }

        // If the email is not in use, create a new user and add them to the list
        User newUser = new User(name, email, password, birthday);
        users.add(newUser); // Save the user in the list

        return "Registration successful."; // Success message
    }

    // Static method to log in
    public static String login(String email, String password) {
        // Loop through the list of users to find one with the correct email and password
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                // If a matching user is found, log in successfully
                return "Login successful. Welcome, " + user.name + "!";
            }
        }
        // If no matches are found, display an error
        return "Error: Incorrect email or password.";
    }
}

