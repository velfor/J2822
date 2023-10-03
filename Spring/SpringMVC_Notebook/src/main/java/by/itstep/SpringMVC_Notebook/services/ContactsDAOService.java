package by.itstep.SpringMVC_Notebook.services;

import by.itstep.SpringMVC_Notebook.model.Contact;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ContactsDAOService {
    List<Contact> getAllContacts();
    void addContact(Contact contact);
    Contact findContactById(Long id);

    boolean empty();
}
