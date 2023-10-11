package com.dubrouskaya.springbootmodule.repository;

import com.dubrouskaya.springbootmodule.entity.Book;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void saveTest() {
        bookRepository.save(new Book("Alice's Adventures in Wonderland", "Lewis Carroll"));

        List<Book> users = (List<Book>) bookRepository.findAll();
        Assertions.assertEquals(1, users.size());
    }
}
