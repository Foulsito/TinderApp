public class Photo {
    // Attribute to store the name of the photo file
    private String photoName;

    // Constructor: Initializes the photo with the file name
    public Photo(String photoName) {
        this.photoName = photoName; // Assign the file name to the attribute
    }

    // Getter method: Returns the name of the photo file
    public String getPhotoName() {
        return photoName;
    }

    // Setter method: Updates the name of the photo file
    public void setPhotoName(String PhotoName) {
        this.photoName = photoName; // Update the file name
    }
}