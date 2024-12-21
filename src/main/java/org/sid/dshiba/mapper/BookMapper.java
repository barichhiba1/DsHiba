package org.sid.dshiba.mapper;

import org.modelmapper.ModelMapper;
import org.sid.dshiba.dao.entities.Book;
import org.sid.dshiba.dto.BookDto;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private  final ModelMapper mapper= new ModelMapper();

    public Book BookDtoBook(BookDto bookDto) {
        return mapper.map(bookDto, Book.class);
    }

    public BookDto BookToBookDto(Book book) {
        return mapper.map(book, BookDto.class);
    }
}