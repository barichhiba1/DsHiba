package org.sid.dshiba.service;

import org.sid.dshiba.dao.entities.Book;
import org.sid.dshiba.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface BookService {
    public BookDto saveBook(BookDto bookDto);
    public  Boolean deleteBook (Long id);
    public List<BookDto> getBookByTitle(String title );
    public  List<BookDto> getBookByTitleAndAuthor(String title ,String Author  );
}
