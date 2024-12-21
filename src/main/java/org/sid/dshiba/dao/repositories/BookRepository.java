package org.sid.dshiba.dao.repositories;

import org.sid.dshiba.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    public List<Book> findBookByTitle(String title);

    public List<Book> findBookByTitleAndAuthor(String title, String author);
}