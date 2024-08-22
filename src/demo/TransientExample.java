package demo;

import java.io.*;

class UserProfile implements Serializable {
    private String username;
    private transient String password;

    public UserProfile(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }
}

public class TransientExample {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("john_doe", "securePassword123");

        // Serializing the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("userprofile.ser"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializing the object
        UserProfile deserializedUser = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("userprofile.ser"))) {
            deserializedUser = (UserProfile) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Displaying the deserialized object
        System.out.println("Deserialized UserProfile: " + deserializedUser);
    }
}
