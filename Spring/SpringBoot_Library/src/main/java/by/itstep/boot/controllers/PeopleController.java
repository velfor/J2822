package by.itstep.boot.controllers;

import by.itstep.boot.model.Book;
import by.itstep.boot.model.People;
import by.itstep.boot.service.PeopleDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Api(value = "People", description = "Methods for getting info about peoples")
public class PeopleController {
    @Autowired
    private PeopleDaoService peopleDaoService;

//    @GetMapping("/index")
//    public String start(Model model) {
//        Book book = new Book(10, "Золотой ключик");
//        Book book2 = new Book(30, "Сказки");
//        //model.addAttribute("book", book);
//
//        List<Book> bookList = Arrays.asList(book, book2);
//
//        model.addAttribute("books", bookList);
//        return "index";
//    }

//    @ApiOperation(value = "getAllPeople")
//    @ApiResponses( value = {
//            @ApiResponse(code = 200, message = "Данные о всех любях получены"),
//            @ApiResponse(code = 404, message = "Ресурс не найден")
//        }
//    )
    @GetMapping("/all_people")
    public String getAllPeople(Model model) {
        List<People> peopleList = peopleDaoService.getAllPeople();
        model.addAttribute("peoples", peopleList);
        return "peoples";
    }
//
//    @GetMapping("/all_people_new")
//    @ResponseBody
//    public List<People> getAllPeople() {
//        List<People> peopleList = peopleDaoService.getAllPeople();
//        return peopleList;
//    }
//
    @GetMapping("/find/{id}") ///find/{id}
    public String findPeopleById(@PathVariable("id") Long peopleId, Model model) {
        People people = peopleDaoService.findPeopleById(peopleId);
        model.addAttribute("people", people);
        return "people_detail_info";
    }
//
//    @GetMapping("/add_people") ///find/{id}
//    public String showFormAddPeople(@ModelAttribute("people") People people) {
//        return "new_people";
//    }
//
//    @PostMapping("/new_people") ///find/{id}
//    public String addPeople(@ModelAttribute("people") @Valid People people, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "new_people";
//        }
//        System.out.println("fio new people's " + people.getFio());
//        return "new_people";
//    }
//
//    @ModelAttribute("additionalValue")
//    public String additionalValue() {
//        return "Hello!!!!";
//    }
}
