package io.devmentor.examples.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class LibraryApplicationTest {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  void loadContext() {
    Assertions.assertNotNull(applicationContext);
  }
}
