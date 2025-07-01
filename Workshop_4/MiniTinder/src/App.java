import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

/**
 * Main application class for TinderApp.
 * Handles the welcome screen, user registration, login, and profile browsing.
 */
public class App {
    /**
     * Displays the welcome screen with login and register buttons.
     */
    public static void showWelcomeScreen() {
        /**
         * Main Window (JFrame) Configuration
         */
        JFrame frame = new JFrame("Tinder App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 320);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        /**
         * Main panel with vertical BoxLayout to stack elements
         */
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);

        // Top spacing to separate from the edge
        mainPanel.add(Box.createVerticalStrut(36));

        /**
         * Panel for welcome texts (one below the other)
         */
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setOpaque(false);

        // Label for "Welcome to"
        JLabel labelWelcome = new JLabel("Welcome to");
        labelWelcome.setFont(new Font("Arial", Font.PLAIN, 15));
        labelWelcome.setForeground(Color.BLACK);
        int leftMargin = 40; // Cambia este valor para mover el texto a la derecha
        labelWelcome.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelWelcome.setBorder(BorderFactory.createEmptyBorder(0, leftMargin, 0, 0));
        textPanel.add(labelWelcome);

        // Label for "TinderApp"
        JLabel labelTinder = new JLabel("TinderApp");
        labelTinder.setFont(new Font("Arial", Font.BOLD, 36));
        labelTinder.setForeground(Color.BLACK);
        labelTinder.setAlignmentX(Component.CENTER_ALIGNMENT);
        textPanel.add(labelTinder);

        mainPanel.add(textPanel);

        // Spacing between buttons and texts
        mainPanel.add(Box.createVerticalStrut(32));

        /**
         * Panel for buttons (one below the other)
         */
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setOpaque(false);

        // Button of Log in
        JButton btnLogin = new JButton("Log In");
        btnLogin.setFont(new Font("Arial", Font.BOLD, 16));
        btnLogin.setBackground(Color.WHITE);
        btnLogin.setForeground(Color.BLACK);
        btnLogin.setFocusPainted(false);
        btnLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnLogin.setMaximumSize(new Dimension(200, 44));
        btnLogin.setBorder(new javax.swing.border.LineBorder(Color.LIGHT_GRAY, 2, true));

        // Button of Create account
        JButton btnRegister = new JButton("Create account");
        btnRegister.setFont(new Font("Arial", Font.BOLD, 16));
        btnRegister.setBackground(Color.WHITE);
        btnRegister.setForeground(Color.BLACK);
        btnRegister.setFocusPainted(false);
        btnRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnRegister.setMaximumSize(new Dimension(200, 44));
        btnRegister.setBorder(new javax.swing.border.LineBorder(Color.LIGHT_GRAY, 2, true));

        // Add Buttons 
        buttonPanel.add(btnLogin);
        buttonPanel.add(Box.createVerticalStrut(18));
        buttonPanel.add(btnRegister);

        mainPanel.add(buttonPanel);
        mainPanel.add(Box.createVerticalGlue());

        frame.setContentPane(mainPanel);

        /**
         * Buttons action
         */
        btnLogin.addActionListener(e -> {
            frame.dispose();
            startConsoleApp(2); // 2 = Login
        });

        btnRegister.addActionListener(e -> {
            frame.dispose();
            showRegisterFrame();
        });

        // Show the screen
        frame.setVisible(true);
    }
    /**
     * Displays the registration frame for creating a new account.
     */
    public static void showRegisterFrame() {
        // User register 
        JFrame registerFrame = new JFrame("Create Account - TinderApp");
        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registerFrame.setSize(400, 420);
        registerFrame.setLocationRelativeTo(null);
        registerFrame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel title = new JLabel("Create Account");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.BLACK);
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.X_AXIS));
        titlePanel.setOpaque(false);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.add(Box.createHorizontalGlue());
        titlePanel.add(title);
        titlePanel.add(Box.createHorizontalGlue());
        mainPanel.add(titlePanel);
        mainPanel.add(Box.createVerticalStrut(18));

        JTextField fieldName = new JTextField();
        fieldName.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        JLabel labelName = new JLabel("Name:");
        mainPanel.add(labelName);
        mainPanel.add(fieldName);

        JTextField fieldEmail = new JTextField();
        fieldEmail.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        JLabel labelEmail = new JLabel("Email:");
        mainPanel.add(labelEmail);
        mainPanel.add(fieldEmail);

        JPasswordField fieldPassword = new JPasswordField();
        fieldPassword.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        JLabel labelPassword = new JLabel("Password:");
        mainPanel.add(labelPassword);
        mainPanel.add(fieldPassword);

        JTextField fieldBirthday = new JTextField();
        fieldBirthday.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        JLabel labelBirthday = new JLabel("Birthday (YYYY-MM-DD):");
        mainPanel.add(labelBirthday);
        mainPanel.add(fieldBirthday);

        JTextField fieldBiography = new JTextField();
        fieldBiography.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        JLabel labelBiography = new JLabel("Biography:");
        mainPanel.add(labelBiography);
        mainPanel.add(fieldBiography);

        JTextField fieldInterests = new JTextField();
        fieldInterests.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        JLabel labelInterests = new JLabel("Interests:");
        mainPanel.add(labelInterests);
        mainPanel.add(fieldInterests);

        JButton btnSubmit = new JButton("Register");
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
        btnSubmit.setBackground(Color.WHITE);
        btnSubmit.setForeground(Color.BLACK);
        btnSubmit.setFocusPainted(false);
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.X_AXIS));
        btnPanel.setOpaque(false);
        btnPanel.add(Box.createHorizontalGlue());
        btnPanel.add(btnSubmit);
        btnPanel.add(Box.createHorizontalGlue());
        btnSubmit.setMaximumSize(new Dimension(200, 44));
        btnSubmit.setBorder(new javax.swing.border.LineBorder(Color.LIGHT_GRAY, 2, true));
        mainPanel.add(Box.createVerticalStrut(18));
        mainPanel.add(btnPanel);

        registerFrame.setContentPane(mainPanel);

        btnSubmit.addActionListener(e -> {
            JOptionPane.showMessageDialog(registerFrame, "Cuenta creada (demo). Implementa la lógica real aquí.");
            registerFrame.dispose();
            showWelcomeScreen();
        });

        registerFrame.setVisible(true);
    }

    /**
     * Starts the console app with the selected option.
     */
    private static void startConsoleApp(int option) {
        try {
            User.loadFromFile();
            executeConsoleApp(option);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // == == == == == == == == ==

    /**
     * Console logic.
     */
    private static void executeConsoleApp(int initialOption) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option = initialOption;

        while (true) {
            if (option == 0) {
                printMenu();
                option = scanner.nextInt();
                scanner.nextLine();
            }
            if (option == 1) {
                /**
                 * This block handles the registration process.
                 * It asks the user for their details and ensures the email is unique.
                 */
                String email;
                while (true) {
                    System.out.print("Email: ");
                    email = scanner.nextLine();

                    // Check if the email is already in use
                    boolean emailExists = false;
                    for (User user : User.getUsers()) {
                        if (user.getEmail().equals(email)) {
                            System.out.println("Error: The email is already in use. Please enter a different email.");
                            emailExists = true;
                            break;
                        }
                    }

                    if (!emailExists) break;
                }

                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                System.out.print("Birthday (YYYY-MM-DD): ");
                String birthdayInput = scanner.nextLine();
                LocalDate birthday;
                try {
                    birthday = LocalDate.parse(birthdayInput);
                } catch (Exception e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");
                    continue;
                }

                System.out.print("Biography: ");
                String biography = scanner.nextLine();
                System.out.print("Interests: ");
                String interests = scanner.nextLine();

                System.out.println("Gender Identity:");
                System.out.println("1. Cisgender Men");
                System.out.println("2. Cisgender Woman");
                System.out.println("3. Trans Men");
                System.out.println("4. Trans Woman");
                System.out.println("5. Non-Binary");
                System.out.println("6. Other");

                String genderIdentity;
                while (true) {
                    int genIden = scanner.nextInt();
                    scanner.nextLine();

                    if (genIden == 1) {
                        genderIdentity = "Cisgender Men";
                        break;
                    } else if (genIden == 2) {
                        genderIdentity = "Cisgender Woman";
                        break;
                    } else if (genIden == 3) {
                        genderIdentity = "Trans Men";
                        break;
                    } else if (genIden == 4) {
                        genderIdentity = "Trans Woman";
                        break;
                    } else if (genIden == 5) {
                        genderIdentity = "Non-Binary";
                        break;
                    } else if (genIden == 6) {
                        System.out.print("Please specify your gender identity: ");
                        genderIdentity = scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Invalid option. Please try again.");
                        continue;
                    }
                }

                System.out.println("Sexual Orientation:");
                System.out.println("1. Heterosexual");
                System.out.println("2. Homosexual");
                System.out.println("3. Bisexual");
                System.out.println("4. Other");

                String sexualOrientation;
                while (true) {
                    int sexOr = scanner.nextInt();
                    scanner.nextLine();

                    if (sexOr == 1) {
                        sexualOrientation = "Heterosexual";
                        break;
                    } else if (sexOr == 2) {
                        sexualOrientation = "Homosexual";
                        break;
                    } else if (sexOr == 3) {
                        sexualOrientation = "Bisexual";
                        break;
                    } else if (sexOr == 4) {
                        System.out.print("Please specify your sexual orientation: ");
                        sexualOrientation = scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Invalid option. Please try again.");
                        continue;
                    }
                }

                User newUser = new User(name, email, password, birthday, biography, interests, genderIdentity, sexualOrientation);
                String result = newUser.register();
                System.out.println(result);
                option = 0; // Reset to show menu
            }
            else if (option == 2) {
                /**
                 * This block handles the login process.
                 */
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();

                User loggedInUser = null;
                for (User user : User.getUsers()) {
                    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                        loggedInUser = user;
                        break;
                    }
                }

                if (loggedInUser == null) {
                    System.out.println("Error: Incorrect email or password.");
                    continue;
                }

                System.out.println("Login successful. Welcome, " + loggedInUser.name + "!");
                while (true) {
                    System.out.println("You are logged in. Select an option:");
                    System.out.println("1. Log out");
                    System.out.println("2. View other users");

                    int loggedInOption = scanner.nextInt();
                    scanner.nextLine();

                    if (loggedInOption == 1) {
                        System.out.println("You have logged out.");
                        break;
                    } else if (loggedInOption == 2) {
                        /**
                         * This block handles viewing other users.
                         */
                        System.out.println("Other users:");

                        if (User.getUsers().size() <= 1) {
                            System.out.println("No other users available.");
                            continue;
                        }

                        int currentIndex = 0;
                        while (true) {
                            User currentUser = User.getUsers().get(currentIndex);

                            if (currentUser.getEmail().equals(loggedInUser.getEmail())) {
                                currentIndex = (currentIndex + 1) % User.getUsers().size();
                                continue;
                            }

                            System.out.println("Name: " + currentUser.name);
                            System.out.println("Biography: " + currentUser.biography);
                            System.out.println("Interests: " + currentUser.interests);
                            System.out.println("Gender Identity: " + currentUser.genderIdentity);
                            System.out.println("Sexual Orientation: " + currentUser.sexualOrientation);
                            System.out.println("Birthday: " + currentUser.birthday);
                            System.out.println("--------------------------");

                            System.out.println("Select an option:");
                            System.out.println("1. Next user");
                            System.out.println("2. Previous user");
                            System.out.println("3. Exit to menu");

                            int navigationOption = scanner.nextInt();
                            scanner.nextLine();

                            if (navigationOption == 1) {
                                currentIndex = (currentIndex + 1) % User.getUsers().size();
                            } else if (navigationOption == 2) {
                                currentIndex = (currentIndex - 1 + User.getUsers().size()) % User.getUsers().size();
                            } else if (navigationOption == 3) {
                                break;
                            } else {
                                System.out.println("Invalid option. Please try again.");
                            }
                        }
                    } else {
                        System.out.println("Invalid option. Please try again.");
                    }
                }
                option = 0; // Reset to show menu
            }
            else if (option == 3) {
                System.out.println("Goodbye!");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid option.");
                option = 0;
            }
        }
    }

    /**
     * This method prints the main menu options for the user.
     */
    public static void printMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

    /**
     * Entry point of the application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> showWelcomeScreen());
    }
}