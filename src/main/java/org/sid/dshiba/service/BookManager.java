package org.sid.dshiba.service;

import lombok.AllArgsConstructor;
import org.sid.dshiba.dao.entities.Book;
import org.sid.dshiba.dao.repositories.BookRepository;
import org.sid.dshiba.dto.BookDto;
import org.sid.dshiba.mapper.BookMapper;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookManager implements BookService{
    private BookRepository bookRepository;
    private BookMapper bookMapper;
    @Override
    public BookDto saveBook(BookDto bookDto) {
       Book book= bookMapper.BookDtoBook(bookDto);


        return null;
    }

    @Override
    public Boolean deleteBook(Long id) {
        return null;
    }

    @Override
    public List<BookDto> getBookByTitle(String title) {
        return null;
    }

    @Override
    public List<BookDto> getBookByTitleAndAuthor(String title, String Author) {
        return null;
    }
}
