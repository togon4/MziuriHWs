package PhoneBookSystem;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Data {
    public static void serializeContacts(List<PhoneContact> contacts, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error while saving contacts: " + e.getMessage());
        }
    }

    public static List<PhoneContact> deserializeContacts(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<PhoneContact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}

