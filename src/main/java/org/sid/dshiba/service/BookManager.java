package org.sid.dshiba.service;

import lombok.AllArgsConstructor;
import org.sid.dshiba.dao.entities.Book;
import org.sid.dshiba.dao.repositories.BookRepository;
import org.sid.dshiba.dto.BookDto;
import org.sid.dshiba.mapper.BookMapper;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class BookManager implements BookService{
    private BookRepository bookRepository;
    private BookMapper bookMapper;
    @Override
    public BookDto saveBook(BookDto bookDto) {
       Book book= bookMapper.BookDtoBook(bookDto);
       book=bookRepository.save(book);
       bookDto=bookMapper.fromBookToBookDto(book);
        return bookDto;
    }


    @Override
    public Boolean deleteBook(Long id) {
        try{
            bookRepository.findById(id);
            return true;
        }catch (Exception exception){
            return  false;
        }
    }

    @Override
    public List<BookDto> getBookByTitle(String title) {
        List<Book>books=bookRepository.findBookByTitle(title);
        List<BookDto>bookDtos=new ArrayList<>();
        for(Book book:books){
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }

        return bookDtos;
    }

    @Override
    public List<BookDto> saveAvions(List<BookDto> bookDtos) {
      List<Book>books=new ArrayList<>();
      for(BookDto bookDto:bookDtos){
          books.add(bookMapper.BookDtoBook(bookDto));
      }


        return bookDtos;
    }


    @Override
    public List<BookDto> getBookByTitleAndAuthor(String title, String Author) {
      List<Book>books=bookRepository.findBookByTitleAndAuthor(title,Author);
      List<BookDto> bookDtos=new ArrayList<>();
      for (Book book:books) {
          bookDtos.add(bookMapper.fromBookToBookDto(book));
      }


        return bookDtos;
    }
}
