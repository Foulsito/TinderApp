import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    private String email;
    public LocalDate birthday;
    private String password;
    public String biography;
    public String interests;
    public String genderIdentity;
    public String sexualOrientation;
    private static List<User> users = new ArrayList<>();
    private static final String FILE_PATH = "users.txt";

    /**
     * This is the constructor for the User class. It creates a new user with all their details.
     * 
     * @param name The name of the user
     * @param email The email of the user
     * @param password The password of the user
     * @param birthday The user's birthday
     * @param biography A short description about the user
     * @param interests Things the user likes or is interested in
     * @param genderIdentity How the user identifies their gender
     * @param sexualOrientation The user's sexual orientation
     */
    public User(String name, String email, String password, LocalDate birthday, String biography, String interests, String genderIdentity, String sexualOrientation) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.biography = biography;
        this.interests = interests;
        this.genderIdentity = genderIdentity;
        this.sexualOrientation = sexualOrientation;
    }

    /**
     * This method gets the user's email.
     * 
     * @return The email of the user
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method gets the user's password.
     * 
     * @return The password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method registers the user. It checks if the email is already in use, and if not, adds the user to the list.
     * 
     * @return A message saying whether the registration was successful or if the email is already in use
     */
    public String register() {
        for (User user : users) {
            if (user.getEmail().equals(this.email)) {
                return "Error: The email is already in use.";
            }
        }
        users.add(this);
        saveToFile(); // Save the updated user list to the file
        return "Registration successful.";
    }

    /**
     * This static method gets the list of all registered users.
     * 
     * @return The list of all users
     */
    public static List<User> getUsers() {
        return users;
    }

    /**
     * This static method saves all users to a file. It writes each user's details in a structured format.
     */
    public static void saveToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            for (User user : users) {
                fileWriter.write(user.name + "," + user.email + "," + user.password + "," + user.birthday + "," +
                        user.biography + "," + user.interests + "," + user.genderIdentity + "," + user.sexualOrientation + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error saving users to file: " + e.getMessage());
        }
    }

    /**
     * This static method loads all users from a file. It reads each line and creates a User object for each entry.
     */
    public static void loadFromFile() {
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 8) {
                    String name = parts[0];
                    String email = parts[1];
                    String password = parts[2];
                    LocalDate birthday = LocalDate.parse(parts[3]);
                    String biography = parts[4];
                    String interests = parts[5];
                    String genderIdentity = parts[6];
                    String sexualOrientation = parts[7];
                    users.add(new User(name, email, password, birthday, biography, interests, genderIdentity, sexualOrientation));
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error loading users from file: " + e.getMessage());
        }
    }
}