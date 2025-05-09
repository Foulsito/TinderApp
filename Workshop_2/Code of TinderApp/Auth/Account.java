public class Account {
    // Attributes (camelCase)
    private String id;                      // In this line we store account identifier
    private String email;                   // In this line we declare user email
    private String password;                // In this line we keep password (consider char[] for security)

    // Methods (camelCase)
    public boolean register(String email, String password, String id) {  
        return false;
    }
    
    public boolean login(String email, String password) {
        return false;
    }
    
    public void logout() {
    }
    
    public boolean changePassword(String currentPassword, String newPassword) {
        return false;
    }
}