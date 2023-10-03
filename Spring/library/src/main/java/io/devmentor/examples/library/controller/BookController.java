package io.devmentor.examples.library.controller;

import io.devmentor.examples.library.entity.Book;
import io.devmentor.examples.library.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

  private final BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public List<Book> getList(@RequestParam(required = false) String genre) {
    if (genre != null) {
      return bookService.getAllByGenre(genre);
    }

    return bookService.getAll();
  }
}
