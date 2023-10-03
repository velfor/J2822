package by.itstep.SpringMVC_Notebook.services;

import by.itstep.SpringMVC_Notebook.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ContactDAOServiceImpl implements ContactsDAOService{
    private static List<Contact> contacts = new ArrayList<>();
    static {
        contacts.add(new Contact(1L, "Ivanov I.V.", "+375291112233", "ivanov222@gmail.com", "", ""));
        contacts.add(new Contact(1L, "Petrov P.E.", "+375294445566", "petrov1987@gmail.com", "", ""));
    }
    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public Contact findContactById(Long id) {
        return contacts.stream().filter(contact -> contact.getId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean empty(){return contacts.isEmpty();}
}
