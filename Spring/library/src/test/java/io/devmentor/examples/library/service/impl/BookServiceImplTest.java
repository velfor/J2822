package io.devmentor.examples.library.service.impl;

import io.devmentor.examples.library.entity.Book;
import io.devmentor.examples.library.repository.BookRepository;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookServiceImplTest {

  @Mock
  private BookRepository bookRepository;

  @InjectMocks
  private BookServiceImpl bookService;

  @Test
  void shouldReturnBooksFilteredByGenre() {
    String genre = "data_science";
    List<Book> books = createBooks();

    Mockito.when(bookRepository.findAll()).thenReturn(books);

    List<Book> result = bookService.getAllByGenre(genre);

    Assertions.assertNotNull(result);
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(books.get(1), result.get(0));
  }

  private List<Book> createBooks() {
    Book firstBook = new Book();
    Book secondBook = new Book();

    firstBook.setId(1L);
    firstBook.setTitle("Fundamentals of Wavelets");
    firstBook.setAuthor("Goswami, Jaideva");
    firstBook.setGenre("signal_processing");
    firstBook.setHeight(228);
    firstBook.setPublisher("Wiley");

    secondBook.setId(2L);
    secondBook.setTitle("Data Smart");
    secondBook.setAuthor("Foreman, John");
    secondBook.setGenre("data_science");
    secondBook.setHeight(235);
    secondBook.setPublisher("Wiley");

    return List.of(firstBook, secondBook);
  }
}
