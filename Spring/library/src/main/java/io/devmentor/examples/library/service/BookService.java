package io.devmentor.examples.library.service;

import io.devmentor.examples.library.entity.Book;
import java.util.List;

public interface BookService {

  List<Book> getAll();
  List<Book> getAllByGenre(String genre);
}
