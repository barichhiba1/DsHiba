package org.sid.dshiba.service;

import org.sid.dshiba.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface BookService {
   // void saveBook(List<BookDto> books);

   public BookDto saveBook(BookDto bookDto);
    public  Boolean deleteBook (Long id);
    public List<BookDto> getBookByTitle(String title );
    public List<BookDto> saveAvions(List<BookDto>bookDtos);
    public  List<BookDto> getBookByTitleAndAuthor(String title ,String Author  );



}
