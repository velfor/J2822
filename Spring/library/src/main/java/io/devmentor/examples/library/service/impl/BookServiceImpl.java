package io.devmentor.examples.library.service.impl;

import io.devmentor.examples.library.entity.Book;
import io.devmentor.examples.library.repository.BookRepository;
import io.devmentor.examples.library.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  @Autowired
  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> getAll() {
    return bookRepository.findAll();
  }

  @Override
  public List<Book> getAllByGenre(String genre) {
    return bookRepository.findAll().stream()
        .filter(book -> genre.equals(book.getGenre()))
        .toList();
  }
}
