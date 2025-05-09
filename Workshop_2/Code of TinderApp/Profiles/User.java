import java.util.List;

public class User {
    public String name;                     // In this line we declare the user's name as String
    public String birthday;                 // In this line we define birthday date as String
    public String genderIdentity;           // In this line we specify gender identity String
    public String sexualOrientation;        // In this line we declare sexual orientation String
    public String photo;                    // In this line we store photo references as String
    public String biography;                // In this line we keep user biography as String
    public String interests;                // In this line we store interests as String
    public List<Tag> tags;                  // In this line we maintain a List of Tag objects
    public int age;                         // In this line we track age as integer
    

    public List<Filter> saveProfileInfo() {  // In this line we define profile saving that returns List<Filter>
        return null;
    }
    
    public boolean register(String email, String password, String id, ) { // In this line we create a registration method returning boolean
        return false;                     // In this line we create a registration method returning boolean
    }
    
    public void selectTags() {               // In this line we declare tag selector with void return
    }
    
    public void editProfile() {              // In this line we establish profile editor with void return
    }
    
    public void uploadPhoto(String photo) {  // In this line we define photo uploader with void return
    }
    
    public boolean giveInteraction() {       // In this line we set up interaction giver returning boolean
        return false;
    }
    
    public boolean reportUser() {            // In this line we implement user reporter returning boolean
        return false;
    }
    
    public void accessToNotification() {    // In this line we control notification access with void return
    }
}