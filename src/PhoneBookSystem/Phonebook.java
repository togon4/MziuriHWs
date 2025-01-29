package PhoneBookSystem;
import java.util.List;

public class Phonebook {
    private static final String FILE_NAME = "C:\\Users\\pc\\Desktop\\PhoneBookFile";
    private static final int MAX_CONTACTS = 30;
    private List<PhoneContact> contacts;

    public Phonebook() {
        contacts = Data.deserializeContacts(FILE_NAME);
    }

    public void addContact(PhoneContact contact) {
        if (contacts.size() < MAX_CONTACTS) {
            contacts.add(contact);
            Data.serializeContacts(contacts, FILE_NAME);
        } else {
            System.out.println("Phonebook is full. Cannot add more contacts.");
        }
    }

    public void deleteContact(String firstName, String lastName) {
        contacts.removeIf(contact -> contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName));
        Data.serializeContacts(contacts, FILE_NAME);
    }

    public void editContact(String firstName, String lastName, PhoneContact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            PhoneContact contact = contacts.get(i);
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                contacts.set(i, updatedContact);
                Data.serializeContacts(contacts, FILE_NAME);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (PhoneContact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
