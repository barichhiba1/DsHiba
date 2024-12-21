package org.sid.dshiba;

import org.sid.dshiba.dto.BookDto;
import org.sid.dshiba.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsHibaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsHibaApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BookService bookService) {
        return args -> {


            bookService.saveBook(
                    (BookDto) List.of(
                            BookDto.builder().title("tit1").author("auth1").genre("romance").price(20.20).isbn("ndndsj").build(),
                            BookDto.builder().title("tit2").author("auth2").genre("fiction").price(250.20).isbn("ndhhj").build(),
                            BookDto.builder().title("tit3").author("auth3").genre("romance").price(270.20).isbn("npppj").build(),
                            BookDto.builder().title("tit4").author("auth4").genre("fiction").price(50.20).isbn("nmam,dj").build()
                    )
            );
        };
    }
}