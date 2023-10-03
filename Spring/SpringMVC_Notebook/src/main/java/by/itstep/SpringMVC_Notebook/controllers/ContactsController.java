package by.itstep.SpringMVC_Notebook.controllers;

import by.itstep.SpringMVC_Notebook.model.Contact;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import by.itstep.SpringMVC_Notebook.services.ContactDAOServiceImpl;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactsController {
    @Autowired
    private ContactDAOServiceImpl contactDAOService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/contacts")
    public String getAllContacts(Model model){
        List<Contact> contactList = contactDAOService.getAllContacts();
        model.addAttribute("contacts", contactList);
        return "contacts";
    }

    @GetMapping("/find/{id}")
    public String findPeopleById(Model model, @PathVariable("id") Long contactId){
        Contact contact = contactDAOService.findContactById(contactId);
        model.addAttribute("contact", contact);
        return "contact_info";
    }

    @GetMapping("/add_contact")
    public String showFormAddContact(@ModelAttribute("contact") Contact contact){
        return "add_contact";
    }

    @PostMapping("/add_contact")
    public String addContact(@ModelAttribute("contact") @Valid Contact contact, BindingResult bindingResult){
        if(bindingResult.hasErrors()){

        }
        return "add_contact";
    }
}
