import java.util.ArrayList;
import java.util.List;

public class Notification {
    // Attribute to store notification messages
    private List<String> message = new ArrayList<>();

    // Method to add a message to the attribute
    public void addMessage(String newMessage) {
        message.add(newMessage);
    }

    // Method to retrieve all messages
    public List<String> getMessages() {
        return message;
    }
}
